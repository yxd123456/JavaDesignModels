package asus.observermodel;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;

import java.util.Arrays;
import java.util.List;

/**
 * 托管所有Fragment的Activity，程序的入口
 */
public class ThirdActivity extends FragmentActivity {

    public MainFragment mf = new MainFragment();

    public List<Fragment> fragments = Arrays.asList((Fragment) mf);
    private FragmentUtils fragmentUtils;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        fragmentUtils = new FragmentUtils(this, fragments, R.id.fragment_content);
    }

}
