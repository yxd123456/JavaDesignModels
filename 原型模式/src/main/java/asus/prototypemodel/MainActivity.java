package asus.prototypemodel;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

/**
 * 原型模式被用在频繁调用且极其相似的对象上，
 * 它会克隆对象并设置改变后的属性，而且消耗的资源较少
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Box box = new Box(12);

        for (int i = 0; i < 1000; i++) {
            try {
                Prototype prototype = box.clone();
                prototype.setSize(i+1);
                prototype.logSize();
            } catch (CloneNotSupportedException e) {
                e.printStackTrace();
            }
        }
        
    }
}
