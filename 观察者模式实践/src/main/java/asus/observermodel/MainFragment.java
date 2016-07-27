package asus.observermodel;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by asus on 2016/7/27.
 */
public class MainFragment extends FragmentSubject{

    TextView textView;
    Button btn;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment, container, false);
        textView = (TextView) v.findViewById(R.id.tv);
        btn = (Button) v.findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                observer.notifyActivity(msg().obj("这是来自Fragment的消息").end(), SecondActivity.subject);
            }
        });
        return v;
    }

    @Override
    public void update() {
        textView.setText((CharSequence) observer.getActivityMessage().obj);
    }
}
