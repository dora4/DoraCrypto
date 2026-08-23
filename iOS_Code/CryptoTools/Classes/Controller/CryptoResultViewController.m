//
//  CryptoResultViewController.m
//  CryptoToolsIos
//
//  Created by dora on 2024/10/16.
//

#import "CryptoResultViewController.h"

@interface CryptoResultViewController ()

@end

@implementation CryptoResultViewController

- (instancetype)initWithData:(NSData *)data {
    self = [super init];
    if (self) {
        _data = data;  // 传递的数据
    }
    return self;
}

- (void)viewDidLoad {
    [super viewDidLoad];
    [self.view setBackgroundColor:[[UIColor blackColor] colorWithAlphaComponent:0.5]];
    // 使用传递过来的数据
    NSLog(@"Received data: %@", self.data);
    
    NSString *base64String = [self.data base64EncodedStringWithOptions:0];
    NSLog(@"Encrypted Data (Base64): %@", base64String);
    // 创建 UILabel
    CGFloat screenWidth = [UIScreen mainScreen].bounds.size.width;
    CGFloat screenHeight = [UIScreen mainScreen].bounds.size.height;
    CGFloat statusBarHeight = [UIApplication sharedApplication].statusBarFrame.size.height;
    CGFloat navigationBarHeight = self.navigationController.navigationBar.frame.size.height;
    CGFloat screenHeightWithoutNavBarAndStatusBar = screenHeight - statusBarHeight - navigationBarHeight;

    UILabel *label = [[UILabel alloc] initWithFrame:CGRectMake(0, 0, screenWidth - 20, screenHeightWithoutNavBarAndStatusBar - 20)];
    label.text = base64String;
    label.textAlignment = NSTextAlignmentCenter;
    label.textColor = [UIColor whiteColor];  // 设置文字颜色为白色
    // 设置多行显示，直到空间不足
    label.numberOfLines = 0;
    // 设置 label 的 center 使其在 semiTransparentView 中居中
    label.center = CGPointMake(self.view.frame.size.width / 2, self.view.frame.size.height / 2);
    // 启用交互以响应手势
    label.userInteractionEnabled = YES;

    // 添加长按手势识别器
    UILongPressGestureRecognizer *longPressGesture = [[UILongPressGestureRecognizer alloc] initWithTarget:self action:@selector(handleLongPress:)];
    [label addGestureRecognizer:longPressGesture];
    // 将 label 添加到半透明视图
    [self.view addSubview:label];

}

// 长按手势处理方法
- (void)handleLongPress:(UILongPressGestureRecognizer *)gestureRecognizer {
    if (gestureRecognizer.state == UIGestureRecognizerStateBegan) {
        // 获取 UILabel 的文本
        UILabel *label = (UILabel *)gestureRecognizer.view;
        NSString *textToCopy = label.text;

        // 将文本复制到剪贴板
        if (textToCopy) {
            UIPasteboard *pasteboard = [UIPasteboard generalPasteboard];
            pasteboard.string = textToCopy;

            UIAlertController *alert = [UIAlertController alertControllerWithTitle:@"Copied" message:label.text preferredStyle:UIAlertControllerStyleAlert];
            [self presentViewController:alert animated:YES completion:^{
                // 自动消失
                dispatch_after(dispatch_time(DISPATCH_TIME_NOW, (int64_t)(1.5 * NSEC_PER_SEC)), dispatch_get_main_queue(), ^{
                    [alert dismissViewControllerAnimated:YES completion:nil];
                });
            }];
        }
    }
}

@end
