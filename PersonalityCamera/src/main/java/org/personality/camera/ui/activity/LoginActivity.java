package org.personality.camera.ui.activity;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;

/**
 * =====================================
 * 项目名称：org.personality.camera.ui.activity
 * 类描述：
 * 创建人：大风车
 * 创建时间：2016/3/26 0:07
 * 修改人：大风车
 * 修改时间：2016/3/26 0:07
 * 版本说明：Version1.0
 * =====================================
 */
public class LoginActivity extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_tag);
    }
}
