//
//  MainViewController.m
//  CryptoToolsIos
//
//  Created by dora on 2024/10/14.
//

#import "MainViewController.h"
#import "../Other/UIColor+Hex.h"
#import "../View/MenuItemView.h"
#import "AESEncryptViewController.h"
#import "AESDecryptViewController.h"

@interface MainViewController ()

@end

@implementation MainViewController

- (void)viewDidLoad {
    [super viewDidLoad];
    [self setupNavBar];
    CGFloat titleHeight = 36;
    CGFloat itemHeight = 40;
    CGFloat dividerHeight = 1;
    CGFloat screenWidth = [UIScreen mainScreen].bounds.size.width;
    CGFloat statusBarHeight = [UIApplication sharedApplication].statusBarFrame.size.height;
    NSLog(@"Status Bar Height: %f", statusBarHeight);
    CGFloat navBarHeight = self.navigationController.navigationBar.frame.size.height;
    NSLog(@"Nav Bar Height: %f", navBarHeight);
    
    UILabel *aesLabel = [[UILabel alloc] init];
    aesLabel.font = [UIFont systemFontOfSize:16];
    aesLabel.textColor = [UIColor lightGrayColor];
    aesLabel.text = @"AES";
    [aesLabel setFrame:CGRectMake(10, statusBarHeight+navBarHeight, screenWidth - 20, titleHeight)];
    [self.view addSubview:aesLabel];
    
    MenuItemView *aesEncryptItemView = [[MenuItemView alloc] initWithTitle:@"AES加密"];
    [aesEncryptItemView setFrame:CGRectMake(0, statusBarHeight+navBarHeight+titleHeight, screenWidth, itemHeight)];
    [aesEncryptItemView setBackgroundColor:[UIColor whiteColor]];
    [aesEncryptItemView addGestureRecognizer: [[UITapGestureRecognizer alloc] initWithTarget:self action:@selector(aesEncrypt)]];
    [self.view addSubview:aesEncryptItemView];
    MenuItemView *aesDecryptItemView = [[MenuItemView alloc] initWithTitle:@"AES解密"];
    [aesDecryptItemView setFrame:CGRectMake(0, statusBarHeight+navBarHeight+titleHeight+itemHeight+dividerHeight, screenWidth, itemHeight)];
    [aesDecryptItemView setBackgroundColor:[UIColor whiteColor]];
    [aesDecryptItemView addGestureRecognizer: [[UITapGestureRecognizer alloc] initWithTarget:self action:@selector(aesDecrypt)]];
    [self.view addSubview:aesDecryptItemView];
}

- (void)aesEncrypt {
    AESEncryptViewController * controller = [[AESEncryptViewController alloc] init];
    [self.navigationController pushViewController:controller animated:YES];
}

- (void)aesDecrypt {
    AESDecryptViewController * controller = [[AESDecryptViewController alloc] init];
    [self.navigationController pushViewController:controller animated:YES];
}

- (void)setupNavBar {
    self.navigationItem.title = @"加密工具";
    if (@available(iOS 15.0, *)) {
        UINavigationBarAppearance *appearance = [[UINavigationBarAppearance alloc] init];
        [appearance configureWithOpaqueBackground];  // 使用不透明背景
        appearance.backgroundColor = [UIColor systemPurpleColor];  // 设置导航栏背景颜色
        appearance.titleTextAttributes = @{NSForegroundColorAttributeName: [UIColor whiteColor]};
        self.navigationController.navigationBar.standardAppearance = appearance;
        self.navigationController.navigationBar.scrollEdgeAppearance = appearance;
    } else {
        [self.navigationController.navigationBar setTitleTextAttributes:@{NSForegroundColorAttributeName: [UIColor whiteColor]}];
        self.navigationController.navigationBar.barTintColor = [UIColor colorWithHexString:@"bb86fc"];
    }
}

@end
