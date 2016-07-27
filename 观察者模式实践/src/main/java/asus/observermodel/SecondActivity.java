package asus.observermodel;

import android.os.Bundle;
import android.os.Message;
import android.view.View;
import android.widget.TextView;

public class SecondActivity extends ActivitySubject {

    private TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        observer.attachActivity(this);
        tv = (TextView) findViewById(R.id.tv);
    }

    public void back(View v){
        observer.notifyActivity(getMsg()
                .setObject("这是返回给MainActivity的消息").getMessage(), MainActivity.subject);
    }

    @Override
    public void update() {
        Message message = observer.getActivityMessage();
        tv.setText((CharSequence) message.obj);
    }
}
