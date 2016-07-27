package asus.adaptermodel;

import android.graphics.Paint;

/**
 * Created by asus on 2016/7/27.
 */
public class MyPaint extends Paint {

    private MyPaintAdapter adapter;

    public MyPaint(){

    }

    public MyPaint setAdapter(MyPaintAdapter adapter){
        this.adapter = adapter;
        return this;
    }

    public void setViewBackGroundColor(int color){
        adapter.setBackgroundColor(color);
    }

}
