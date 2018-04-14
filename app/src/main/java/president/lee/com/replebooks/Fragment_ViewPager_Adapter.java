package president.lee.com.replebooks;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Administrator on 2018-04-14.
 */

public class Fragment_ViewPager_Adapter extends FragmentPagerAdapter {

    private final int ITEM_COUNT = 5;

    public Fragment_ViewPager_Adapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return Fragment_ViewPager.getInstance(position);
    }

    @Override
    public int getCount() {
        return ITEM_COUNT;
    }
}
