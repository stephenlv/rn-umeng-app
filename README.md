#rn-umeng-app
##安装
```
npm install rn-umeng-app
react-native link
```

##集成到iOS
在`Appdelegate.m`中对应的位置添加如下三个API：

```
#import "UmengAppManager.h"

- (BOOL)application:(UIApplication *)application didFinishLaunchingWithOptions:(NSDictionary *)launchOptions
{
  //注册友盟推送
    NSString *version = [[[NSBundle mainBundle] infoDictionary] objectForKey:@"CFBundleShortVersionString"];
    [UmengAppManager initializeMobClickWith:UMENG_APPKEY andVersion:version];
}

```

##集成到android

在`MainApplication.java`中添加如下代码：


```
  import cn.biubiuapp.umengapp.UmengAppModule;
  import cn.biubiuapp.umengapp.UmengAppPackage;

    protected List<ReactPackage> getPackages() {
      return Arrays.<ReactPackage>asList(
          ...
            new UmengAppPackage(),
            ...
      );

  @Override
  public void onCreate() {
    super.onCreate();

    UmengAppModule.initializeMobClick(this.getApplicationContext(), umengAppKey, umengChannel);
  }
```



##More
* 欢迎大家Pull Request
* 有什么疑问，欢迎提问题
* 觉得好的，来一个star
