package com.example.lindborg.lab3;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.os.Bundle;
import android.widget.ImageView;

public class ShapeActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shape);

        ImageView imageView = findViewById(R.id.imageView);
        Bitmap ourBitmap = Bitmap.createBitmap(250,500, Bitmap.Config.ARGB_8888);
        Canvas ourCanvas = new Canvas(ourBitmap);
        Paint paint = new Paint();

        ourCanvas.drawColor(Color.BLACK);

        paint.setColor(Color.argb(255, 255, 255, 255));

        ourCanvas.drawText("Score: 42 Lives: 3 Hi: 97", 10, 10, paint);
        ourCanvas.drawLine(10, 50, 200, 50, paint);
        ourCanvas.drawCircle(110, 160, 100, paint);
        ourCanvas.drawPoint(10, 260, paint);
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(Color.argb(255, 0, 0, 255));
        ourCanvas.drawRect(50, 100, 200, 200,paint);

        imageView.setImageBitmap(ourBitmap);

        drawTriangle(ourCanvas,paint,100,100,150);



    }

    public void drawTriangle(Canvas canvas, Paint paint, int x, int y, int width) {
        int halfWidth = width / 2;

        Path path = new Path();
        path.moveTo(x, y - halfWidth); // Top
        path.lineTo(x - halfWidth, y + halfWidth); // Bottom left
        path.lineTo(x + halfWidth, y + halfWidth); // Bottom right
        path.lineTo(x, y - halfWidth); // Back to Top
        path.close();

        canvas.drawPath(path, paint);
    }
}
