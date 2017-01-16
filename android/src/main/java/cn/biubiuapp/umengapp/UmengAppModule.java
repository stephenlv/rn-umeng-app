package cn.biubiuapp.umengapp;

import android.content.Context;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.umeng.analytics.MobclickAgent;

/**
 * Created by admin on 17/1/16.
 */
public class UmengAppModule extends ReactContextBaseJavaModule {


    public UmengAppModule(ReactApplicationContext reactContext) {
        super(reactContext);
    }

    @Override
    public String getName() {
        return "UmengAppManager";
    }

    @ReactMethod
    public void enterPage(String page) {
        MobclickAgent.onPageStart(page);
        MobclickAgent.onResume(this.getCurrentActivity());
    }

    @ReactMethod
    public void leavePage(String page) {
        MobclickAgent.onPageEnd(page);
        MobclickAgent.onPause(this.getCurrentActivity());
    }

    public static void initializeMobClick(Context context, String appKey, String channelId) {
        MobclickAgent.UMAnalyticsConfig config = new MobclickAgent.UMAnalyticsConfig(context, appKey, channelId);
        MobclickAgent. startWithConfigure(config);
    }

}
