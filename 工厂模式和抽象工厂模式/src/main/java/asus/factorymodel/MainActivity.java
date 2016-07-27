package asus.factorymodel;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;

/**
 * 工厂模式常用于根据不同的参数创建同一父类的不同子类的对象等情景中
 */
public class MainActivity extends AppCompatActivity {

    private LinearLayoutManager manager1;
    private GridLayoutManager manager2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //获取LinearLayoutManager
        manager1 = (LinearLayoutManager) MyFactory.getFactory(this, MyFactory.LINEAR, null)
                .orientation(LinearLayoutManager.VERTICAL).getManager();
        //获取GridLayoutManager
        manager2 = (GridLayoutManager) MyFactory.getFactory(this, MyFactory.GRID, new MyFactory.Manager() {
            @Override
            public int getSpanCount() {
                return 0;
            }
        }).orientation(GridLayoutManager.VERTICAL).getManager();
    }
}
