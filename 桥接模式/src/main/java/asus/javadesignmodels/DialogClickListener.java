package asus.javadesignmodels;

/**
 * Created by asus on 2016/7/27.
 * 对话框的确认和点击事件由各自的对话框根据自身需求来实现
 */
public interface DialogClickListener {

    void confirm();

    void cancel();

}
