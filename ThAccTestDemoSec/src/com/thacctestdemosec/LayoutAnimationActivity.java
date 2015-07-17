package com.thacctestdemosec;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;

/**
 * Description:
 * User: xjp
 * Date: 2015/5/22
 * Time: 15:06
 */

public class LayoutAnimationActivity extends Activity {

    private LinearLayout parent;
    private int i = 0;
    private int j = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_layout_animation);

        parent = (LinearLayout) findViewById(R.id.parent);
    }

    public void buttonClick(View view) {
        addButtonView();
    }

    public void buttonClick1(View view) {
        removeButtonView();
    }

    private void addButtonView() {
        i++;
        Button button = new Button(this);
        button.setText("button" + i);
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT);
        parent.addView(button, params);
    }

    private void removeButtonView() {
        if (i > 0)
            parent.removeViewAt(0);
    }
}