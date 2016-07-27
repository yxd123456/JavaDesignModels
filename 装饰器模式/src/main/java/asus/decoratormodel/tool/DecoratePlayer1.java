package asus.decoratormodel.tool;

import android.util.Log;

/**
 * Created by asus on 2016/7/27.
 */
public class DecoratePlayer1 extends AbstractPlayer {

    public DecoratePlayer1(Play play) {
        super(play);
    }

    @Override
    public void playLOL() {
        Log.d("Test", "正在斗鱼直播......");
        play.playLOL();
        Log.d("Test", "正在结束直播......");
    }


}
