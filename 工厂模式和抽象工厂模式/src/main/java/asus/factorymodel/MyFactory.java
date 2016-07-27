package asus.factorymodel;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

/**
 * Created by asus on 2016/7/27.
 */
public class MyFactory implements AbstractFactory{

    public static final int LINEAR = 0;
    public static final int GRID = 1;
    private static RecyclerView.LayoutManager manager;
    private static int typeFlag;

    @Override
    public AbstractFactory init(Context context, int type, int count) {
        typeFlag = type;
        if(type == LINEAR){
            manager = new LinearLayoutManager(context);
        } else if(type == GRID){
            if(count != 0){
                manager = new GridLayoutManager(context, count);
            } else {
                manager = new GridLayoutManager(null, 1);
            }
        }
        return new MyFactory();
    }

    @Override
    public AbstractFactory orientation(int orient) {
        if(typeFlag == 0){
            ((LinearLayoutManager)manager).setOrientation(orient);
        } else {
            ((GridLayoutManager)manager).setOrientation(orient);
        }
        return this;
    }

    @Override
    public RecyclerView.LayoutManager getManager() {
        return manager;
    }

}
