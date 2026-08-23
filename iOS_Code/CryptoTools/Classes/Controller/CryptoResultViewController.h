//
//  CryptoResultViewController.h
//  CryptoToolsIos
//
//  Created by dora on 2024/10/16.
//

#import <UIKit/UIKit.h>

NS_ASSUME_NONNULL_BEGIN

@interface CryptoResultViewController : UIViewController

@property (nonatomic, strong) NSData *data;

- (instancetype)initWithData:(NSData *)data;

@end

NS_ASSUME_NONNULL_END
