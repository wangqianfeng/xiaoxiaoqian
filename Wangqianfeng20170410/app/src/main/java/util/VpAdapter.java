package util;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.view.View;

import java.util.List;

import static android.R.id.list;

/**
 * 用途：
 * author：王倩凤Administrator
 * date:2017/4/10.
 */

public class VpAdapter extends FragmentPagerAdapter {


    private final List<Fragment> list;
    private final String[] title;

    public VpAdapter(FragmentManager fm, List<Fragment> list,String[] title) {
        super(fm);
        this.list = list;
        this.title = title;
    }

    @Override
    public Fragment getItem(int position) {
        return list.get(position);
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return title[position];
    }
}
