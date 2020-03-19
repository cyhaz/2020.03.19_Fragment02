package kr.co.youhyun.a20200319_fragment02.adapters;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import kr.co.youhyun.a20200319_fragment02.fragments.ChickenStoreFragment;
import kr.co.youhyun.a20200319_fragment02.fragments.RoomListFragment;

public class MainViewPagerAdapter extends FragmentPagerAdapter {

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return "치킨 가게";
        } else {
            return "방 목록";
        }
    }

    public MainViewPagerAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        if (position == 0){
            return new ChickenStoreFragment();
        } else {
            return  new RoomListFragment();
        }
    }

    @Override
    public int getCount() {
        return 2;
    }
}
