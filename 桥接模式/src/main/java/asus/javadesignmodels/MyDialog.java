package asus.javadesignmodels;

import android.content.Context;
import android.widget.Button;

/**
 * Created by asus on 2016/7/27.
 */
public class MyDialog extends AbstractDialog {

    protected MyDialog(Context context, DialogClickListener listener) {
        super(context, listener);
        setContentView(R.layout.dialog);
        setTitle("桥接模式");
        findViewById(R.id.btn1).setOnClickListener(this);
        findViewById(R.id.btn2).setOnClickListener(this);
    }

    @Override
    protected boolean getCondition2(int id) {
        return id == R.id.btn2;
    }

    @Override
    protected boolean getCondition1(int id) {
        return id == R.id.btn1;
    }


}
