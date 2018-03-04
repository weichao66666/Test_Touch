package io.weichao.test_touch;
import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.RelativeLayout;
/**
 * Created by pi on 2017/7/27.
 */
public class CustomRelativeLayout extends RelativeLayout {
    public CustomRelativeLayout(Context context) {
        super(context);
    }
    public CustomRelativeLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
    }
    public CustomRelativeLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }
    public CustomRelativeLayout(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }
    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        Log.d("test_touch", "CustomRelativeLayout dispatchTouchEvent");
        return super.dispatchTouchEvent(ev);
    }
    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        Log.d("test_touch", "CustomRelativeLayout onInterceptTouchEvent");
        return super.onInterceptTouchEvent(ev);
    }
    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Log.d("test_touch", "CustomRelativeLayout onTouchEvent");
        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:
                Log.d("test_touch", "CustomRelativeLayout onTouchEvent MotionEvent.ACTION_DOWN");
                break;
            case MotionEvent.ACTION_MOVE:
                Log.d("test_touch", "CustomRelativeLayout onTouchEvent MotionEvent.ACTION_MOVE");
                break;
            case MotionEvent.ACTION_UP:
                Log.d("test_touch", "CustomRelativeLayout onTouchEvent MotionEvent.ACTION_UP");
                break;
        }
        return super.onTouchEvent(event);
    }
}