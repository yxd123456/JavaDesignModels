package asus.decoratormodel;

import android.util.Log;

import asus.decoratormodel.tool.Play;

/**
 * Created by asus on 2016/7/27.
 */
public class White implements Play{
    @Override
    public void playLOL() {
        Log.d("Test", "WHITE正在玩LOL");
    }
}
