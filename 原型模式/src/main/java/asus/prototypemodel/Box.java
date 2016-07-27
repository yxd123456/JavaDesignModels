package asus.prototypemodel;

import android.util.Log;

/**
 * Created by asus on 2016/7/27.
 */
interface Prototype {
    void setSize(int x);
    void logSize();
}

// 一个具体类
public class Box implements Prototype, Cloneable {
    private int size;

    public Box(int x) {
        this.size = x;
    }

    @Override
    public void setSize(int x) {
        this.size = x;
    }

    @Override
    public void logSize() {
        Log.d("Test", "size: "+size);
    }

    @Override
    public Box clone() throws CloneNotSupportedException {
        return (Box) super.clone();
    }
}
