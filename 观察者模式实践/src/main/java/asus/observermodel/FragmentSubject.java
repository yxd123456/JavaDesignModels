package asus.observermodel;

import android.support.v4.app.Fragment;

/**
 * Created by asus on 2016/7/27.
 */
public abstract class FragmentSubject extends Fragment {

    protected Observer observer = Observer.getObserver();

    public abstract void update();

    public MessageUtil getMsg(){
        return new MessageUtil();
    }

}
