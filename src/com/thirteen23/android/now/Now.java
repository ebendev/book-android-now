package com.thirteen23.android.now;

import android.app.Activity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.*;

public class Now extends Activity implements CompoundButton.OnCheckedChangeListener, RadioGroup.OnCheckedChangeListener {

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        setContentView(R.layout.main);

        CheckBox checkBox = (CheckBox)findViewById(R.id.check);
        checkBox.setOnCheckedChangeListener(this);
        
        RadioGroup group = (RadioGroup)findViewById(R.id.group);
        group.setOnCheckedChangeListener(this);
    }

    public void onClick(View view) {
        TextView textView = (TextView)findViewById(R.id.field);
        String name = textView.getText().toString();
        
        TextView greeting = (TextView)findViewById(R.id.greeting);
        greeting.setText(String.format("Hello, %s!", name));
        
        LinearLayout layout = (LinearLayout)findViewById(R.id.lowerPanel);
        layout.setVisibility(View.VISIBLE);
    }

    public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
        ImageView imageView = (ImageView)findViewById(R.id.icon);
        imageView.setVisibility(isChecked ? View.VISIBLE : View.GONE);
    }

    public void onCheckedChanged(RadioGroup radioGroup, int checkedId) {
        LinearLayout greetingPanel = (LinearLayout)findViewById(R.id.greetingPanel);
        if (checkedId == R.id.radioLeft) greetingPanel.setGravity(Gravity.LEFT);
        else if (checkedId == R.id.radioCenter) greetingPanel.setGravity(Gravity.CENTER);
        else if (checkedId == R.id.radioRight) greetingPanel.setGravity(Gravity.RIGHT);
    }
}