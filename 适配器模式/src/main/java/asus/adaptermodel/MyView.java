package asus.adaptermodel;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;

/**
 * Created by asus on 2016/7/27.
 */
public class MyView extends MyPaintAdapter {

    private MyPaint myPaint;

    public MyView(Context context) {
        super(context);
    }

    public MyView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void init() {
        myPaint = getInstance().color(Color.BLACK).style(Paint.Style.FILL).getMyPaint().setAdapter(this);
        //View通过适配器直接获取paint并调用了Paint的方法
        myPaint.setViewBackGroundColor(Color.GREEN);
        //Paint也通过适配器来调用了View的方法
    }

    @SuppressLint("DrawAllocation")
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawCircle(300, 300, 100, myPaint);
    }
}
