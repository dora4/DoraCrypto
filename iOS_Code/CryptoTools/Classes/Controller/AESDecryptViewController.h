//
//  AESDecryptViewController.h
//  CryptoToolsIos
//
//  Created by dora on 2024/10/16.
//

#import <UIKit/UIKit.h>

NS_ASSUME_NONNULL_BEGIN

@interface AESDecryptViewController : UIViewController

@property (nonatomic, strong) UITextField *secretKeyTextField;
@property (nonatomic, strong) UITextField *contentTextField;

@end

NS_ASSUME_NONNULL_END
