package com.hq.hqmusic.CustomView;

import android.app.Dialog;
import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.Gravity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

import com.hq.hqmusic.R;


public class CustomDialog extends Dialog implements
        android.view.View.OnClickListener {

    private TextView textview1;
    private TextView textview2;
    private Button button1;
    private Button button2;

    static int width = 300;
    static int height = 150;

    public CustomDialog(Context context, int layout, int style) {
        this(context, width, height, layout, style);
    }

    public CustomDialog(Context context, double width, double height,
                        int layout, int style) {
        super(context, style);

        setContentView(layout);

        initWidgets();
        // 设置窗口属性
        Window window = getWindow();
        WindowManager.LayoutParams params = window.getAttributes();
        // 设置宽度、高度、密度、对齐方式
        float density = getDensity(context);

        params.width = (int) (width * density);
        params.height = (int) (height * density);
        params.gravity = Gravity.CENTER;
        window.setAttributes(params);
    }

    public void setT(String string) {
        textview1.setText(string);
    }

    public void setM(String string) {
        textview2.setText(string);
    }

    public void setButtonLeftText(String string) {
        button1.setText(string);
    }

    public void setButtonRightText(String string) {
        button2.setText(string);
    }

    @Override
    protected void onStop() {
        // TODO Auto-generated method stub
        super.onStop();

    }

    private void initWidgets() {
        button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(this);
        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(this);
        textview1 = (TextView) findViewById(R.id.textview1);
        textview2 = (TextView) findViewById(R.id.textview2);
    }

    public float getDensity(Context context) {
        Resources res = context.getResources();
        DisplayMetrics dm = res.getDisplayMetrics();
        return dm.density;
    }

    @Override
    public void onClick(View v) {
        // TODO Auto-generated method stub

        switch (v.getId()) {
            case R.id.button1:
                if (listener != null)
                    listener.onClickOk();

                break;
            case R.id.button2:
                if (listener != null)
                    listener.onClickCancel();

                break;
            default:
                break;
        }

    }

    public void setOnClickBtnListener(OnClickBtnListener listener) {
        this.listener = listener;
    }

    private OnClickBtnListener listener = null;

    public interface OnClickBtnListener {

        public void onClickOk();

        public void onClickCancel();
    }
}
