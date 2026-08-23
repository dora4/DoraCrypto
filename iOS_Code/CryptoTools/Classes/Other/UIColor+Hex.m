//
//  UIColor+Hex.m
//  dorachat-iphone
//
//  Created by dora on 2024/9/21.
//

#import "UIColor+Hex.h"

@implementation UIColor (Hex)

// 默认alpha为1
+ (UIColor*) colorWithHexString:(NSString*)color {
    return [self colorWithHexString:color alpha:1.0];
}

// color支持@"#123456"、@"0x123456"和@"123456"三种格式
+ (UIColor*) colorWithHexString:(NSString *)color alpha:(CGFloat)alpha {
    // 处理输入的字符串，去掉前导的 # 或 0x
       if ([color hasPrefix:@"#"]) {
           color = [color substringFromIndex:1];
       } else if ([color hasPrefix:@"0x"]) {
           color = [color substringFromIndex:2];
       }

       // 确保颜色字符串长度正确
       if ([color length] != 6) {
           return [UIColor clearColor]; // 返回透明色表示出错
       }

       // 将字符串拆分成 RGB 组件
       NSRange range;
       range.location = 0;
       range.length = 2;
       NSString *rString = [color substringWithRange:range];

       range.location = 2;
       NSString *gString = [color substringWithRange:range];

       range.location = 4;
       NSString *bString = [color substringWithRange:range];

       // 将字符串转换为十进制数
       unsigned int r, g, b;
       [[NSScanner scannerWithString:rString] scanHexInt:&r];
       [[NSScanner scannerWithString:gString] scanHexInt:&g];
       [[NSScanner scannerWithString:bString] scanHexInt:&b];

       // 返回 UIColor 对象
       return [UIColor colorWithRed:((float) r / 255.0f)
                              green:((float) g / 255.0f)
                               blue:((float) b / 255.0f)
                              alpha:alpha];
}

@end
