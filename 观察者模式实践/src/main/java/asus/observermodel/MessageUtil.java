package asus.observermodel;

import android.os.Message;

/**
 * Created by asus on 2016/7/27.
 */
public class MessageUtil {

    private Message message;

    public MessageUtil(){
        message = Message.obtain();
    }

    public <T> MessageUtil obj(T t){
        message.obj = t;
        return this;
    }

    public MessageUtil what(int what){
        message.what = what;
        return this;
    }

    public Message end(){
        return message;
    }


}
