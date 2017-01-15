//
//  UmengAppManager.m
//  UmengAppManager
//
//  Copyright © 2017年 HongAnDuoWei. All rights reserved.
//

#import "UmengAppManager.h"
#import "MobClick.h"

@implementation UmengAppManager

RCT_EXPORT_MODULE()

+ (void) initializeMobClickWith: (NSString*) appkey andVersion: (NSString*) version {
    UMConfigInstance.appKey = appkey;
    UMConfigInstance.channelId = @"App Store";
    [MobClick startWithConfigure:UMConfigInstance];
    
}

RCT_EXPORT_METHOD(enterPage: (NSString*) page) {
     [MobClick beginLogPageView: page];
}


RCT_EXPORT_METHOD(leavePage: (NSString*) page) {
    [MobClick endLogPageView: page];
}


@end
