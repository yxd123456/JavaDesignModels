package asus.buildermodel;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

/**
 * 建造者模式与工厂模式十分类似，主要区别在于对于不同的对象划分是通过继承来实现的，而不是标记区分来实现的。
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LinearLayoutManager manager1 = (LinearLayoutManager) new ManagerBuilder(this)
                .orientation(LinearLayoutManager.VERTICAL).getManager();

        GridLayoutManager manager2 = (GridLayoutManager) new ManagerBuilder(this)
                .orientation(GridLayoutManager.VERTICAL).getManager();
    }
}
