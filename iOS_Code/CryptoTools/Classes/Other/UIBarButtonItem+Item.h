//
//  UIBarButtonItem+Item.h
//  dorachat-iphone
//
//  Created by dora on 2024/9/23.
//

#import <UIKit/UIKit.h>

NS_ASSUME_NONNULL_BEGIN

@interface UIBarButtonItem (Item)

+ (UIBarButtonItem*) itemWithImage:(UIImage*)image highlightImage:(UIImage*) highlightImage target:(id)target action:(SEL)action;
@end

NS_ASSUME_NONNULL_END
