package asus.javadesignmodels;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

/**
 * 简单来讲，桥接模式是一个两层的抽象
 * 桥接模式是用于“把抽象和实现分开，这样它们就能独立变化。
 * 桥接模式使用了封装、聚合，可以用继承将不同的功能拆分为不同的类。
 *
 * 桥接模式可以简单理解为抽象类+接口模式
 * 抽象类封装了一些通用逻辑，并添加了一些抽象方法来辅助接口工作
 * 接口则代表着一类抽象行为，这些行为具有极大的可变性，必须根据具体需求来实现
 */
public class MainActivity extends AppCompatActivity {

    private MyDialog myDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myDialog = new MyDialog(this, new DialogClickListener() {
            @Override
            public void confirm() {
                Toast.makeText(MainActivity.this, "点击了确认", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void cancel() {
                Toast.makeText(MainActivity.this, "点击了取消", Toast.LENGTH_SHORT).show();
            }
        });

        myDialog.show();
    }
}
