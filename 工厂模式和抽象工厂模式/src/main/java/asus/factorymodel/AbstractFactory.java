package asus.factorymodel;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;

/**
 * Created by asus on 2016/7/27.
 */
public interface AbstractFactory {
    AbstractFactory init(Context context, int type, @Nullable int count);
    AbstractFactory orientation(int orient);
    RecyclerView.LayoutManager getManager();
}
