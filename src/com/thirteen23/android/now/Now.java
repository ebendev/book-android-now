package com.thirteen23.android.now;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Date;

public class Now extends Activity {
    Button button;
    
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        setContentView(R.layout.button);

        button = (Button)findViewById(R.id.button);

        updateTime();
    }

    public void onClick(View view) {
        updateTime();
    }

    private void updateTime() {
        button.setText(new Date().toString());
    }
}