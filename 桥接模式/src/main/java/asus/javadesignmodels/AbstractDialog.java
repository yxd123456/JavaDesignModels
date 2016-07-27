package asus.javadesignmodels;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.view.View;

/**
 * Created by asus on 2016/7/27.
 * 将抽象对话框类与点击事件接口桥接在一起
 */
public abstract class AbstractDialog extends Dialog implements View.OnClickListener{

    private DialogClickListener listener;

    protected AbstractDialog(Context context, DialogClickListener listener) {
        super(context);
        this.listener = listener;
    }

    @Override
    public void onClick(View view) {
        if(getCondition1(view.getId())){
            listener.confirm();
        } else if(getCondition2(view.getId())){
            listener.cancel();
        }
    }

    protected abstract boolean getCondition2(int id);

    protected abstract boolean getCondition1(int id);
}
