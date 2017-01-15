//
//  UmengAppManager.h
//  UmengAppManager
//
//  Copyright © 2017年 HongAnDuoWei. All rights reserved.
//

#import <Foundation/Foundation.h>
#import "RCTBridgeModule.h"

@interface UmengAppManager : NSObject<RCTBridgeModule>

+ (void) initializeMobClickWith: (NSString*) appkey andVersion: (NSString*) version;

@end
