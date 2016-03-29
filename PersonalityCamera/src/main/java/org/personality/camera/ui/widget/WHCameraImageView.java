package org.personality.camera.ui.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.NinePatchDrawable;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.ImageView;

import org.personality.camera.base.MyApplication;

/**
 * =====================================
 * 项目名称：org.personality.camera.ui.widget
 * 类描述：
 * 创建人：大风车
 * 创建时间：2016/3/29 0:15
 * 修改人：大风车
 * 修改时间：2016/3/29 0:15
 * 版本说明：Version1.0
 * =====================================
 */

public class WHCameraImageView extends ImageView{
    // 控件默认长、宽
    private int defaultWidth = 0;
    private int defaultHeight = 0;
    //比例
    private float scale = 0;
    public WHCameraImageView(Context context) {
        super(context);
    }

    public WHCameraImageView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public WHCameraImageView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    @Override
    protected void onDraw(Canvas canvas) {

       Drawable drawable  =  getDrawable();
        if(drawable == null){
            return ;
        }

        if(getWidth()==0 || getHeight() == 0){
            return ;
        }

        this.measure(0,0);
        if (drawable.getClass() == NinePatchDrawable.class){
            return ;
        }

        Bitmap b = ((BitmapDrawable) drawable).getBitmap();
        Bitmap bitmap = b.copy(Bitmap.Config.ARGB_8888, true);
        if (bitmap.getWidth() == 0 || bitmap.getHeight() == 0) {
            return ;
        }
        float img_w = (float) bitmap.getWidth();
        float img_h = (float) bitmap.getHeight();
        if(defaultHeight==0||defaultWidth == 0){
            defaultWidth = MyApplication.getInstance().getScreenWidth();//获取设备的宽度
            defaultHeight = (defaultWidth*4)/3;//按比例来固定
            /*if((img_w*4.0)>=(3.0*img_h)){
                defaultWidth = MyApplication.getInstance().getScreenWidth();//获取设备的宽度
                scale = (float) defaultWidth / (float) bitmap.getWidth();
                defaultHeight =Math.round(bitmap.getHeight() * scale);
            }else{
                int V_Width = MyApplication.getInstance().getScreenWidth();//获取设备的宽度
                defaultHeight = (V_Width*4)/3;//按比例来固定
                scale = (float) defaultHeight / (float) bitmap.getHeight();
                defaultWidth = Math.round(bitmap.getWidth() * scale);
            }*/

        }

        ViewGroup.LayoutParams params = this.getLayoutParams();
        params.width =defaultWidth;
        params.height =defaultHeight;
        this.setLayoutParams(params);
        super.onDraw(canvas);
    }

}
