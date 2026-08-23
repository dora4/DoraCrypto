//
//  MenuItemView.m
//  CryptoToolsIos
//
//  Created by dora on 2024/10/15.
//

#import "MenuItemView.h"
#import "../Other/UIImage+Image.h"

@implementation MenuItemView

- (instancetype)initWithTitle:(NSString *)title {
    self = [super initWithFrame:CGRectZero];
    if (self) {
        [self commonInitWithTitle:title];
    }
    return self;
}

- (void)commonInitWithTitle:(NSString *)title {
    // 创建左边的UILabel
    self.menuLabel = [[UILabel alloc] init];
    self.menuLabel.text = title;
    self.menuLabel.font = [UIFont systemFontOfSize:16];
    self.menuLabel.textColor = [UIColor blackColor];
    [self addSubview:self.menuLabel];
    
    // 创建右边的箭头UIImageView
    UIImage *arrowImage = [UIImage imageOriginalWithName:@"ic_arrow_right"];
    self.arrowImageView = [[UIImageView alloc] initWithImage:arrowImage];
    self.arrowImageView.contentMode = UIViewContentModeScaleAspectFit;

    [self addSubview:self.arrowImageView];
    
    // 使用Auto Layout布局
    self.menuLabel.translatesAutoresizingMaskIntoConstraints = NO;
    self.arrowImageView.translatesAutoresizingMaskIntoConstraints = NO;

    // 添加约束，菜单文字在左边，箭头在右边
    [NSLayoutConstraint activateConstraints:@[
        // 让 menuLabel 在左边，距离父视图左边 10 点
        [self.menuLabel.leadingAnchor constraintEqualToAnchor:self.leadingAnchor constant:10],
        [self.menuLabel.centerYAnchor constraintEqualToAnchor:self.centerYAnchor],
        [self.arrowImageView.widthAnchor constraintEqualToConstant:24],
        [self.arrowImageView.heightAnchor constraintEqualToConstant:24],
        // 让 arrowImageView 在右边，距离父视图右边 10 点
        [self.arrowImageView.trailingAnchor constraintEqualToAnchor:self.trailingAnchor constant:-10],
        [self.arrowImageView.centerYAnchor constraintEqualToAnchor:self.centerYAnchor],
       
        // menuLabel 和 arrowImageView 之间的间距
        [self.menuLabel.trailingAnchor constraintLessThanOrEqualToAnchor:self.arrowImageView.leadingAnchor constant:-10]
    ]];
}

@end
