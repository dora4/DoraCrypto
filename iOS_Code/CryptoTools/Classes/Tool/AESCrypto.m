//
//  AESCrypto.m
//  CryptoToolsIos
//
//  Created by dora on 2024/10/16.
//

#import "AESCrypto.h"
#import <CommonCrypto/CommonCryptor.h>
#import <Foundation/Foundation.h>

@implementation AESCrypto

+ (NSData *)AES256EncryptWithKey:(NSString *)key data:(NSData *)data {
    return [self AES256Operation:kCCEncrypt key:key data:data];
}

+ (NSData *)AES256DecryptWithKey:(NSString *)key data:(NSData *)data {
    return [self AES256Operation:kCCDecrypt key:key data:data];
}

+ (NSData *)AES256Operation:(CCOperation)operation key:(NSString *)key data:(NSData *)data {
    char keyPtr[kCCKeySizeAES256+1]; // 密钥长度（256位 = 32字节）
    bzero(keyPtr, sizeof(keyPtr)); // 初始化keyPtr
    
    [key getCString:keyPtr maxLength:sizeof(keyPtr) encoding:NSUTF8StringEncoding]; // 将密钥转换为C字符串

    size_t dataOutAvailable = data.length + kCCBlockSizeAES128; // 输出缓冲区大小
    void *dataOut = malloc(dataOutAvailable); // 分配内存
    size_t dataOutMoved = 0; // 实际加密数据的大小

    // 执行AES加密/解密
    CCCryptorStatus status = CCCrypt(operation,                  // 加密或解密操作
                                     kCCAlgorithmAES,             // 加密算法
                                     kCCOptionPKCS7Padding,       // 填充方式
                                     keyPtr,                      // 密钥
                                     kCCKeySizeAES256,            // 密钥长度
                                     NULL,                        // 初始向量（此处为nil）
                                     data.bytes,                  // 输入数据
                                     data.length,                 // 输入数据长度
                                     dataOut,                     // 输出缓冲区
                                     dataOutAvailable,            // 输出缓冲区大小
                                     &dataOutMoved);              // 输出大小

    if (status == kCCSuccess) {
        // 成功，返回加密后的数据
        return [NSData dataWithBytesNoCopy:dataOut length:dataOutMoved];
    }

    // 失败，释放内存并返回nil
    free(dataOut);
    return nil;
}

@end
