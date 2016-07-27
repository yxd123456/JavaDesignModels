package asus.buildermodel;

import android.content.Context;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

/**
 * Created by asus on 2016/7/27.
 */
public class ManagerBuilder {

    protected RecyclerView.LayoutManager manager;

    public ManagerBuilder(Context context){

    }

    public ManagerBuilder(Context context, int count){

    }

    protected ManagerBuilder orientation(int orient) {

        return this;
    }

    public RecyclerView.LayoutManager getManager() {
        return manager;
    }
}
