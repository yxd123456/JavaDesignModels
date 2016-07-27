package asus.decoratormodel;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import asus.decoratormodel.tool.DecoratePlayer2;
import asus.decoratormodel.tool.Play;
/*
装饰器模式（Decorator Pattern）允许向一个现有的对象添加新的功能，同时又不改变其结构。
这种类型的设计模式属于结构型模式，它是作为现有的类的一个包装。
这种模式创建了一个装饰类，用来包装原有的类，并在保持类方法签名完整性的前提下，提供了额外的功能。
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //同样的接口方法,通过装饰器来对原先的方法进行修改

        White white1 = new White();
        white1.playLOL();

        Log.d("Test", "=================================");

        //使用装饰器一来对White进行装饰
        Play white2 = new DecoratePlayer2(new White());
        white2.playLOL();

        Log.d("Test", "=================================");

        //使用装饰器二来对White进行装饰
        Play white3 = new DecoratePlayer2(new White());
        white3.playLOL();


       }
}
