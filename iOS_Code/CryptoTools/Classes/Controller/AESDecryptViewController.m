//
//  AESDecryptViewController.m
//  CryptoToolsIos
//
//  Created by dora on 2024/10/16.
//

#import "AESDecryptViewController.h"
#import "../Other/UIBarButtonItem+Item.h"
#import "../Tool/AESCrypto.h"

@interface AESDecryptViewController () <UITextFieldDelegate>

@end

@implementation AESDecryptViewController

- (void)setupNavBar {
    UIBarButtonItem *btn = [UIBarButtonItem itemWithImage:[UIImage imageNamed:@"ic_back"] highlightImage:[UIImage imageNamed:@"ic_back"] target:self action:@selector(goBack)];
    self.navigationItem.leftBarButtonItem = btn;
    self.navigationItem.title = @"AES解密";
}

// UITextFieldDelegate 方法，限制输入字符数
- (BOOL)textField:(UITextField *)textField shouldChangeCharactersInRange:(NSRange)range replacementString:(NSString *)string {
    // 获取当前文本
    NSString *currentText = textField.text;
    // 计算新输入后的文本长度
    NSUInteger newLength = currentText.length + string.length - range.length;
    
    // 限制最大字符数为 16
    return newLength <= 16;
}

-(void)goBack {
    [self.navigationController popViewControllerAnimated:YES];
}

- (void)viewDidLoad {
    [super viewDidLoad];
    [self setupNavBar];
    
    CGFloat titleHeight = 36;
    CGFloat itemHeight = 40;
    CGFloat btnHeight = 45;
    CGFloat screenWidth = [UIScreen mainScreen].bounds.size.width;
    CGFloat statusBarHeight = [UIApplication sharedApplication].statusBarFrame.size.height;
    NSLog(@"Status Bar Height: %f", statusBarHeight);
    CGFloat navBarHeight = self.navigationController.navigationBar.frame.size.height;
    NSLog(@"Nav Bar Height: %f", navBarHeight);
    CGFloat top = statusBarHeight + navBarHeight;
    // 设置光标左边距为 15
    CGFloat leftPadding = 15.0;
    
    UILabel *secretKeyLabel = [[UILabel alloc] init];
    secretKeyLabel.font = [UIFont systemFontOfSize:16];
    secretKeyLabel.textColor = [UIColor lightGrayColor];
    secretKeyLabel.text = @"AES Secret Key";
    [secretKeyLabel setFrame:CGRectMake(10, top, screenWidth - 20, titleHeight)];
    [self.view addSubview:secretKeyLabel];
    top += titleHeight;
    
    self.secretKeyTextField = [[UITextField alloc] init];
    [self.secretKeyTextField setFrame:CGRectMake(0, top, screenWidth, itemHeight)];
    [self.secretKeyTextField setPlaceholder:@"输入16个字母或数字"];
    [self.secretKeyTextField setFont:[UIFont systemFontOfSize:16]];
    [self.secretKeyTextField setBackgroundColor:[UIColor whiteColor]];
    // 设置代理
    self.secretKeyTextField.delegate = self;
    // 创建一个透明视图作为左间距
    UIView *secretKeyPaddingView = [[UIView alloc] initWithFrame:CGRectMake(0, 0, leftPadding, self.secretKeyTextField.frame.size.height)];
    self.secretKeyTextField.leftView = secretKeyPaddingView;
    self.secretKeyTextField.leftViewMode = UITextFieldViewModeAlways;
    [self.view addSubview:self.secretKeyTextField];
    top += itemHeight;
    
    
    UILabel *contentLabel = [[UILabel alloc] init];
    contentLabel.font = [UIFont systemFontOfSize:16];
    contentLabel.textColor = [UIColor lightGrayColor];
    contentLabel.text = @"加密后的内容";
    [contentLabel setFrame:CGRectMake(10, top, screenWidth - 20, titleHeight)];
    [self.view addSubview:contentLabel];
    top += titleHeight;
    
    self.contentTextField = [[UITextField alloc] init];
    [self.contentTextField setFrame:CGRectMake(0, top, screenWidth, itemHeight)];
    [self.contentTextField setPlaceholder:@"输入加密后的内容"];
    [self.contentTextField setFont:[UIFont systemFontOfSize:16]];
    [self.contentTextField setBackgroundColor:[UIColor whiteColor]];
    // 创建一个透明视图作为左间距
    UIView *contentPaddingView = [[UIView alloc] initWithFrame:CGRectMake(0, 0, leftPadding, self.contentTextField.frame.size.height)];
    self.contentTextField.leftView = contentPaddingView;
    self.contentTextField.leftViewMode = UITextFieldViewModeAlways;
    [self.view addSubview:self.contentTextField];
    top += itemHeight;
    
    UIButton *btn = [[UIButton alloc] init];
    [btn setFrame:CGRectMake(0, top + 10, screenWidth, btnHeight)];
    [btn setTitle:@"解密" forState:UIControlStateNormal];
    [btn setTitleColor:[UIColor systemPurpleColor] forState:UIControlStateNormal];
    [btn setBackgroundColor:[UIColor whiteColor]];
    btn.titleLabel.font = [UIFont systemFontOfSize:16];
    [self.view addSubview:btn];
    [btn addTarget:self action:@selector(decrypt) forControlEvents:UIControlEventTouchUpInside];
}

// 校验输入内容
- (BOOL)validateSecretKey {
    NSString *secretKey = self.secretKeyTextField.text;

    // 校验长度
    if (secretKey.length != 16) {
        NSLog(@"请输入16个字符");
        return NO;
    }

    // 校验是否只包含字母或数字
    NSCharacterSet *allowedCharacters = [NSCharacterSet alphanumericCharacterSet];
    if ([secretKey rangeOfCharacterFromSet:allowedCharacters.invertedSet].location != NSNotFound) {
        NSLog(@"请输入字母或数字");
        return NO;
    }

    // 校验通过
    return YES;
}

- (void)decrypt {
    if (![self validateSecretKey]) {
        UIAlertController *alert = [UIAlertController alertControllerWithTitle:nil message:@"长度必须不小于16" preferredStyle:UIAlertControllerStyleAlert];
        [self presentViewController:alert animated:YES completion:^{
            // 自动消失
            dispatch_after(dispatch_time(DISPATCH_TIME_NOW, (int64_t)(1.5 * NSEC_PER_SEC)), dispatch_get_main_queue(), ^{
                [alert dismissViewControllerAnimated:YES completion:nil];
            });
        }];
        return;
    }
    NSString *key = self.secretKeyTextField.text; // AES key should be 32 bytes for AES-256
    NSData *encryptedData = [self.contentTextField.text dataUsingEncoding:NSUTF8StringEncoding];

    // Decrypting data
    NSString *decryptedString = [[NSString alloc] initWithData:encryptedData encoding:NSUTF8StringEncoding];
    NSLog(@"Decrypted String: %@", decryptedString);
}

@end
