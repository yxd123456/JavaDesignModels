package asus.decoratormodel.tool;

/**
 * Created by asus on 2016/7/27.
 */
public abstract class AbstractPlayer implements Play {

    protected Play play;

    public AbstractPlayer(Play play){
        this.play = play;
    }

    public void playLol(){
        play.playLOL();
    }

}
