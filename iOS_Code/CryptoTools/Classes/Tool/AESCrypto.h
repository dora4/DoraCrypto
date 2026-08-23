//
//  AESCrypto.h
//  CryptoToolsIos
//
//  Created by dora on 2024/10/16.
//

#import <Foundation/Foundation.h>

NS_ASSUME_NONNULL_BEGIN

@interface AESCrypto : NSObject

+ (NSData *)AES256EncryptWithKey:(NSString *)key data:(NSData *)data;
+ (NSData *)AES256DecryptWithKey:(NSString *)key data:(NSData *)data;

@end

NS_ASSUME_NONNULL_END
