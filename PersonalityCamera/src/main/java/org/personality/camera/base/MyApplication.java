package org.personality.camera.base;

import android.app.Application;

/**
 * =====================================
 * 项目名称：org.personality.camera.base
 * 类描述：这个就是
 * 创建人：大风车
 * 创建时间：2016/3/24 22:29
 * 修改人：大风车
 * 修改时间：2016/3/24 22:29
 * 版本说明：Version1.0
 * =====================================
 */
public class MyApplication extends Application {
    protected static MyApplication  mInstance;
    @Override
    public void onCreate() {
        super.onCreate();
        mInstance = this;
        // 初始化图片加载

        // 设置登录账户
    }

    public static MyApplication getInstance() {
        if (mInstance != null && mInstance instanceof MyApplication) {
            return mInstance;
        } else {
            mInstance = new MyApplication();
            mInstance.onCreate();
            return mInstance;
        }
    }


    /**
     * 程序的文件目录，如果setting配置的是android，标志目录位于/sdcard/Application/PackageName/...下<br/>
     * 否则，就是/sdcard/setting[root_path]/...目录
     * 待实现
     * @return
     */
    public String getAppPath() {
       return "";
    }
    /**
     * 关于程序所有的文件缓存根目录
     * 待实现
     * @return
     */
    public String getDataPath() {
        return getAppPath()+"";
    }
    /**
     * 图片缓存目录
     * 待实现
     * @return
     */
    public String getImagePath() {
        return getAppPath()+"";
    }
}
