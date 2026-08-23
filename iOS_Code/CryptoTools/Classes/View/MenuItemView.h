//
//  MenuItemView.h
//  CryptoToolsIos
//
//  Created by dora on 2024/10/15.
//

#import <UIKit/UIKit.h>

NS_ASSUME_NONNULL_BEGIN

@interface MenuItemView : UIView

@property (nonatomic, strong) UILabel *menuLabel;
@property (nonatomic, strong) UIImageView *arrowImageView;

- (instancetype)initWithTitle:(NSString *)title;

@end
NS_ASSUME_NONNULL_END
