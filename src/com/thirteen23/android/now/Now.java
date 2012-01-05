package com.thirteen23.android.now;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Date;

public class Now extends Activity implements View.OnClickListener {
    Button button;
    
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle icicle) {
        super.onCreate(icicle);

        button = new Button(this);
        button.setOnClickListener(this);

        updateTime();

        setContentView(button);
    }

    public void onClick(View view) {
        updateTime();
    }

    private void updateTime() {
        button.setText(new Date().toString());
    }
}