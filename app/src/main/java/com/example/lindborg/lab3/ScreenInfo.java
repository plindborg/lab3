package com.example.lindborg.lab3;

import android.content.res.Configuration;
import android.os.Bundle;
import android.app.Activity;
import android.util.DisplayMetrics;
import android.widget.TextView;

import org.w3c.dom.Text;

public class ScreenInfo extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen_info);

        TextView screenInfoText = findViewById(R.id.screenInfo);

        DisplayMetrics metrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(metrics);

        int height          = metrics.heightPixels;
        int width           = metrics.widthPixels;
        float density       = metrics.density;
        int densityDpi      = metrics.densityDpi;
        float scaledDensity = metrics.scaledDensity;


        Configuration configuration = getResources().getConfiguration();
        int configurationSmallestWidth  = configuration.smallestScreenWidthDp;
        int configurationScreenHeight   = configuration.screenHeightDp;
        int configurationScreenWidth    = configuration.screenWidthDp;


        String screenInfo = " PixelHeight: " + height
                + " \n PixelWidth: " + width
                + " \n Density: " + density
                + " \n DensityDpi: " + densityDpi
                + " \n ScaledDensity: " + scaledDensity
                + " \n ConfigurationSmallestWidth: " + configurationSmallestWidth
                + " \n ConfigurationScreenHeight: " + configurationScreenHeight
                + " \n ConfigurationScreenWidth: " + configurationScreenWidth;

        screenInfoText.setText(screenInfo);

    }

}
