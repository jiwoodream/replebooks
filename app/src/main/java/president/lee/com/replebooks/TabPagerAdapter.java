package president.lee.com.replebooks;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by Administrator on 2018-04-14.
 */

public class TabPagerAdapter extends FragmentStatePagerAdapter {

    // Count number of tabs
    private int tabCount;

    public TabPagerAdapter(FragmentManager fm, int tabCount) {
        super(fm);
        this.tabCount = tabCount;
    }

    @Override
    public Fragment getItem(int position) {

        // Returning the current tabs
        switch (position) {
            case 0:
                TabFragment_MyNote myNote = new TabFragment_MyNote();
                return myNote;
            case 1:
                TabFragment_LiveNote liveNote = new TabFragment_LiveNote();
                return liveNote;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return tabCount;
    }
}
