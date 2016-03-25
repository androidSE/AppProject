package org.personality.camera.base;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;

/**
 * =====================================
 * 项目名称：org.personality.camera.base
 * 类描述：应用设置获取标识
 * 创建人：大风车
 * 创建时间：2016/3/24 22:03
 * 修改人：大风车
 * 修改时间：2016/3/24 22:03
 * 版本说明：Version1.0
 * =====================================
 */
public class AppSettings {
    /**
     * 声音提醒
     *
     * @return
     */
    public static boolean isNotifySound() {
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(MyApplication.getInstance());
        return prefs.getBoolean("pNotifySound", true);
    }

    /**
     * 应用常驻内存
     *
     * @return
     */
    public static boolean isAppResident() {
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(MyApplication.getInstance());
        return prefs.getBoolean("pAppResident", true);
    }

    /**
     * 关闭缓存
     *
     * @return
     */
    public static boolean isDisableCache() {
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(MyApplication.getInstance());
        return prefs.getBoolean("pDisableCache", false);
    }
}
