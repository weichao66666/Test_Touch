package io.weichao.test_touch;
import android.content.Context;
import android.support.v7.widget.AppCompatButton;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
/**
 * Created by pi on 2017/7/27.
 */
public class CustomButton extends AppCompatButton {
    public CustomButton(Context context) {
        super(context);
    }
    public CustomButton(Context context, AttributeSet attrs) {
        super(context, attrs);
    }
    public CustomButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }
    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        Log.d("test_touch", "CustomButton dispatchTouchEvent");
        return super.dispatchTouchEvent(ev);
    }
    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Log.d("test_touch", "CustomButton onTouchEvent");
        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:
                Log.d("test_touch", "CustomButton onTouchEvent MotionEvent.ACTION_DOWN");
                break;
            case MotionEvent.ACTION_MOVE:
                Log.d("test_touch", "CustomButton onTouchEvent MotionEvent.ACTION_MOVE");
                break;
            case MotionEvent.ACTION_UP:
                Log.d("test_touch", "CustomButton onTouchEvent MotionEvent.ACTION_UP");
                break;
        }
        return super.onTouchEvent(event);
    }
}