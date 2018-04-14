package president.lee.com.replebooks;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Administrator on 2018-04-14.
 */

public class Fragment_ViewPager extends Fragment {

    private int position;

    public static Fragment_ViewPager getInstance(int position) {
        Fragment_ViewPager fragment_ViewPager = new Fragment_ViewPager();
        fragment_ViewPager.position = position;
        return fragment_ViewPager;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_viewpager, null);

        ((TextView) view.findViewById(R.id.position)).setText(String.valueOf(position));

        return view;
    }
}
