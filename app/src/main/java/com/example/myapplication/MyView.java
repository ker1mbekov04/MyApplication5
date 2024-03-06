package com.example.myapplication;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

public class MyView extends View {
    public MyView(Context context){
        super(context);
    }
    @Override
    public void onDraw(Canvas canvas) {
        Paint paint = new Paint();
        paint.setColor(Color.RED);
        paint.setStyle(Paint.Style.FILL);
        paint.setStrokeWidth(10);
        int diagonalLength = (int) Math.sqrt(Math.pow(getWidth(), 2) + Math.pow(getHeight(), 2));
        int i = -diagonalLength;
        while (i < diagonalLength) {
            canvas.drawLine(0, i, getWidth(), i + getHeight(), paint);
            i +=100;
        }
    }
}
