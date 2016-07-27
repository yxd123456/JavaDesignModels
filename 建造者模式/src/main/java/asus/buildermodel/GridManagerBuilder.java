package asus.buildermodel;

import android.content.Context;
import android.support.v7.widget.GridLayoutManager;

/**
 * Created by asus on 2016/7/27.
 */
public class GridManagerBuilder extends ManagerBuilder {


    public GridManagerBuilder(Context context, int count) {
        super(context, count);
        manager = new GridLayoutManager(context, count);
    }

    @Override
    protected ManagerBuilder orientation(int orient) {
        ((GridLayoutManager)manager).setOrientation(orient);
        return this;
    }


}
