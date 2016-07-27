package asus.decoratormodel.tool;

import android.util.Log;

/**
 * Created by asus on 2016/7/27.
 */
public class DecoratePlayer2 extends AbstractPlayer {

    public DecoratePlayer2(Play play) {
        super(play);
    }

    @Override
    public void playLOL() {
        Log.d("Test", "主播还在赶来的路上......");
    }
}
