//
//  UIColor+Hex.h
//  dorachat-iphone
//
//  Created by dora on 2024/9/21.
//

#import <UIKit/UIKit.h>

NS_ASSUME_NONNULL_BEGIN

@interface UIColor (Hex)

// 默认alpha为1
+ (UIColor*) colorWithHexString:(NSString*)color;
// color支持@"#123456"、@"0x123456"和@"123456"三种格式
+ (UIColor*) colorWithHexString:(NSString *)color alpha:(CGFloat)alpha;

@end

NS_ASSUME_NONNULL_END
