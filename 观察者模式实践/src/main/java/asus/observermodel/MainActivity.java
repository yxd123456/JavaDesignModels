package asus.observermodel;

import android.content.Intent;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends ActivitySubject {

    public static ActivitySubject subject;

    private TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        subject = this;
        observer.attachActivity(this);
        tv = (TextView) findViewById(R.id.tv);
    }

    public void send(View v){
        observer.notifyActivity(getMsg()
                .setObject("Hello 收到了观察者的消息！").getMessage(), MainActivity.this);
    }

    public void go(View v){
        startActivity(new Intent(MainActivity.this, SecondActivity.class));
    }

    @Override
    public void update() {
        tv.setText((CharSequence) observer.getActivityMessage().obj);
    }
}
