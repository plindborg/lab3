package com.example.lindborg.lab3;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MenuActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        final Intent screenInfo = new Intent(this, ScreenInfo.class);
        final Intent shapeActivity = new Intent(this, ShapeActivity.class);

        Button screenInfoBtn    = findViewById(R.id.button3);
        Button shapeBtn         = findViewById(R.id.shapeButton);

        screenInfoBtn.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                startActivity(screenInfo);
            }
        });

        shapeBtn.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                startActivity(shapeActivity);
            }
        });

        TextView text = findViewById(R.id.textView);

    }
}
