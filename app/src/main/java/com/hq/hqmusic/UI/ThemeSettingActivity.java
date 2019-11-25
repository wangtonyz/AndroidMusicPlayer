/*
package com.hq.hqmusic.UI;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.hq.hqmusic.R;

*/
/**
 * Created by 黄庆 on 2018/4/5.
 *//*


public class ThemeSettingActivity extends Activity {
    private Button btn_submit;
    private ImageView imageview_exit;
    private SharedPreferences sharepreferences;

    private SharedPreferences.Editor editor;
    private RadioGroup group;
    private RadioButton button_blue, button_purple, button_green, button_red;
    private String string_theme;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        sharepreferences = getSharedPreferences("location", MODE_PRIVATE);
        // 主题设置
        string_theme = sharepreferences.getString("theme_select", "blue");
        if (string_theme.equals("blue")) {
            setTheme(R.style.Theme_blue);
        } else if (string_theme.equals("purple")) {
            setTheme(R.style.Theme_purple);
        } else if (string_theme.equals("green")) {
            setTheme(R.style.Theme_green);
        } else {
            setTheme(R.style.Theme_red);
        }

        setContentView(R.layout.theme_setting);

        editor = sharepreferences.edit();
        group = this.findViewById(R.id.group);

        button_blue = (RadioButton) group.getChildAt(0);
        button_purple = (RadioButton) group.getChildAt(1);
        button_green = (RadioButton) group.getChildAt(2);
        button_red = (RadioButton) group.getChildAt(3);

        // 初始化单选钮的选中状态
        initRadioButton();

        btn_submit = (Button) this.findViewById(R.id.btn_submit);
        btn_submit.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                submit();
                Intent intent = new Intent(ThemeSettingActivity.this,
                        MainActivity.class);
                ThemeSettingActivity.this.startActivity(intent);
                overridePendingTransition(R.anim.fade, R.anim.hold);
            }
        });
        imageview_exit = (ImageView) this.findViewById(R.id.Theme_setting_exit);
        imageview_exit.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent intent = new Intent(ThemeSettingActivity.this,
                        MainActivity.class);
                ThemeSettingActivity.this.startActivity(intent);
                overridePendingTransition(R.anim.fade, R.anim.hold);
            }
        });
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        // TODO Auto-generated method stub
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            Intent intent = new Intent(ThemeSettingActivity.this,
                    MainActivity.class);
            ThemeSettingActivity.this.startActivity(intent);
            overridePendingTransition(R.anim.fade, R.anim.hold);
        }
        return super.onKeyDown(keyCode, event);
    }

    private void submit() {
        if (button_blue.isChecked()) {
            editor.putString("theme_select", "blue");
            editor.commit();
        }
        if (button_purple.isChecked()) {
            editor.putString("theme_select", "purple");
            editor.commit();
        }
        if (button_green.isChecked()) {
            editor.putString("theme_select", "green");
            editor.commit();
        }
        if (button_red.isChecked()) {
            editor.putString("theme_select", "red");
            editor.commit();
        }
    }

    private void initRadioButton() {
        String string_theme = sharepreferences
                .getString("theme_select", "blue");
        if (string_theme.equals("blue")) {
            button_blue.setChecked(true);
            button_green.setChecked(false);
            button_purple.setChecked(false);
            button_red.setChecked(false);
        } else if (string_theme.equals("purple")) {
            button_blue.setChecked(false);
            button_purple.setChecked(true);
            button_green.setChecked(false);
            button_red.setChecked(false);
        } else if (string_theme.equals("green")) {
            button_blue.setChecked(false);
            button_purple.setChecked(false);
            button_green.setChecked(true);
            button_red.setChecked(false);
        } else {
            button_blue.setChecked(false);
            button_purple.setChecked(false);
            button_green.setChecked(false);
            button_red.setChecked(true);
        }
    }
}
*/
