package asus.observermodel;

import android.util.Log;

/**
 * Created by asus on 2016/7/27.
 */
public class LiLei extends Subject {

    public LiLei(NewspaperOffice office){
        this.office = office;
        this.office.attach(this);
    }

    @Override
    public void readNewspaper() {
        Log.d("Test", "Lilei收到的报纸内容是: "+office.getNewspaper());
    }
}
