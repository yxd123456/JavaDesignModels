package asus.buildermodel;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;

/**
 * Created by asus on 2016/7/27.
 */
public class LinearManagerBuilder extends ManagerBuilder{


    public LinearManagerBuilder(Context context) {
        super(context);
        manager = new LinearLayoutManager(context);
    }

    @Override
    protected ManagerBuilder orientation(int orient) {
        ((LinearLayoutManager)manager).setOrientation(orient);
        return this;
    }


}
