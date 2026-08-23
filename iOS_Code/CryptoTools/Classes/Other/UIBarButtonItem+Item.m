//
//  UIBarButtonItem+Item.m
//  dorachat-iphone
//
//  Created by dora on 2024/9/23.
//

#import "UIBarButtonItem+Item.h"

@implementation UIBarButtonItem (Item)

+ (UIBarButtonItem*) itemWithImage:(UIImage*)image highlightImage:(UIImage*) highlightImage
                            target:(id)target action:(SEL)action {
    UIButton *btn = [UIButton buttonWithType:UIButtonTypeCustom];
    [btn setImage:image forState:UIControlStateNormal];
    [btn setImage:highlightImage forState:UIControlStateHighlighted];
    [btn setBounds:CGRectMake(0, 0, 20, 20)];
    [btn addTarget:target action:action forControlEvents:UIControlEventTouchUpInside];
    UIView *containerView = [[UIView alloc] initWithFrame:btn.bounds];
    btn.center = containerView.center;
    [containerView addSubview:btn];
    return [[UIBarButtonItem alloc]initWithCustomView:containerView];
}

@end
