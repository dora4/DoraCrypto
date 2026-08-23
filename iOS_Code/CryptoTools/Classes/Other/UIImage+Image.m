//
//  UIImage+Image.m
//  dorachat-iphone
//
//  Created by dora on 2024/9/21.
//

#import "UIImage+Image.h"

@implementation UIImage (Image)

+ (UIImage*) imageOriginalWithName:(NSString*)imageName {
    UIImage *image = [UIImage imageNamed:imageName];
    image = [image imageWithRenderingMode:UIImageRenderingModeAlwaysOriginal];
    return image;
}

@end
