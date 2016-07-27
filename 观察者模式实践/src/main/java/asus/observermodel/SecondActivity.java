package asus.observermodel;

import android.content.Intent;
import android.os.Bundle;
import android.os.Message;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends ActivitySubject {

    public static ActivitySubject subject;
    private TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        subject = this;
        observer.attachActivity(subject);
        tv = (TextView) findViewById(R.id.tv);
    }

    public void back(View v){
        observer.notifyActivity(msg().obj("这是返回给MainActivity的消息").end(), MainActivity.subject);
        Toast.makeText(this, "消息反馈给MainActivity了，快回去看看！！", Toast.LENGTH_SHORT).show();
    }

    public void goF(View v){
        startActivity(new Intent(SecondActivity.this, ThirdActivity.class));
    }

    @Override
    public void update() {
        tv.setText((CharSequence) observer.getActivityMessage().obj);
    }
}
