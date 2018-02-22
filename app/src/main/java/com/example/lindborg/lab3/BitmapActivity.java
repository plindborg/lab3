package com.example.lindborg.lab3;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.widget.ImageView;

public class BitmapActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bitmap);

        ImageView image = (ImageView) findViewById(R.id.imageView);
        Bitmap bMap = BitmapFactory.decodeResource(getResources(), R.drawable.mff);
        image.setImageBitmap(bMap);
    }
}
