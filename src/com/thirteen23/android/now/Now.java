package com.thirteen23.android.now;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

import java.util.Date;

public class Now extends Activity implements CompoundButton.OnCheckedChangeListener {
    Button button;
    CheckBox checkBox;
    
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
        setContentView(R.layout.checkbox);
        checkBox = (CheckBox)findViewById(R.id.check);
        checkBox.setOnCheckedChangeListener(this);
    }

    private void updateTime() {
        button.setText(new Date().toString());
    }

    public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
        if (isChecked) {
            checkBox.setText("Checked");
        }
        else {
            checkBox.setText("Unchecked");
            setContentView(R.layout.radiogroup);
        }
    }
}