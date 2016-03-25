package org.personality.camera.base;

import android.os.Environment;

/**
 * =====================================
 * 项目名称：org.personality.camera.base
 * 类描述：用于常量
 * 创建人：大风车
 * 创建时间：2016/3/24 22:01
 * 修改人：大风车
 * 修改时间：2016/3/24 22:01
 * 版本说明：Version1.0
 * =====================================
 */
public class AppConstants {

    public static final String APP_DIR                    = Environment.getExternalStorageDirectory() + "/PersonalituCamera";
    public static final String APP_TEMP                   = APP_DIR + "/temp";
    public static final String APP_IMAGE                  = APP_DIR + "/image";

    public static final int    POST_TYPE_POI              = 1;
    public static final int    POST_TYPE_TAG              = 0;
    public static final int    POST_TYPE_DEFAULT		  = 0;


    public static final float  DEFAULT_PIXEL              = 1242;                           //按iphone6设置
    public static final String PARAM_MAX_SIZE             = "PARAM_MAX_SIZE";
    public static final String PARAM_EDIT_TEXT            = "PARAM_EDIT_TEXT";
    public static final int    ACTION_EDIT_LABEL          = 8080;
    public static final int    ACTION_EDIT_LABEL_POI      = 9090;

    public static final String FEED_INFO                  = "FEED_INFO";


    public static final int REQUEST_CROP = 6709;
    public static final int REQUEST_PICK = 9162;
    public static final int RESULT_ERROR = 404;

}
