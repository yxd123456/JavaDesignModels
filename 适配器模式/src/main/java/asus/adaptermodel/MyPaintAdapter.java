package asus.adaptermodel;

import android.app.Notification;
import android.content.Context;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by asus on 2016/7/27.
 */
public class MyPaintAdapter extends View{

    protected MyPaint myPaint;
    protected static Context ctx;

    public MyPaintAdapter(Context context) {
        super(context);
        ctx = context;
        myPaint = new MyPaint();
        init();
    }

    protected void init() {
    }

    public MyPaintAdapter(Context context, AttributeSet attrs) {
        super(context, attrs);
        ctx = context;
        myPaint = new MyPaint();
        init();
    }

    public static MyPaintAdapter getInstance(){
        return new MyPaintAdapter(ctx);
    }

    public MyPaintAdapter color(int color){
        myPaint.setColor(color);
        return this;
    }

    public MyPaintAdapter style(Paint.Style style){
        myPaint.setStyle(style);
        return this;
    }

    public MyPaint getMyPaint(){
        return myPaint;
    }

    public MyPaintAdapter background(int color){
        setBackgroundColor(color);
        return this;
    }

}
