package asus.adaptermodel;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 *  适配器模式在现代的Java框架中十分常用。这种模式适用于以下场景：想使用一个已存在的类，但是该类不符合接口需求；
    或者需要创建一个可重用的类，适配没有提供合适接口的其它类。
 *
 *  顾名思义，适配器模式可以将两个不相关的类适配到一起，可以调用彼此的变量和函数，就像子类调用父类一样
 *
 */
/*
    myPaint = getInstance().color(Color.BLACK).style(Paint.Style.FILL).getMyPaint().setAdapter(this);
    //View通过适配器获取到paint并调用了Paint的方法
    myPaint.setViewBackGroundColor(Color.GREEN);
    //Paint也通过适配器来调用了View的方法
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
}
