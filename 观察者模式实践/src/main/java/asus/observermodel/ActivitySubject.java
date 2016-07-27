package asus.observermodel;

import android.support.v7.app.AppCompatActivity;

/**
 * Created by asus on 2016/7/27.
 */
public abstract class ActivitySubject extends AppCompatActivity{

    protected Observer observer = Observer.getObserver();

    public abstract void update();


    public MessageUtil msg(){
        return new MessageUtil();
    }

}
