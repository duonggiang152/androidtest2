package com.example.afinal.model;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class ViewerAdapter extends FragmentPagerAdapter {
    private int pageNumber;
    public ViewerAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
        pageNumber = behavior;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0: return new FragmentDanhSach();
            case 1: return new FragmentThongTin();
            case 2: return new FragmentTimkiemvathongke();
        }
        return null;
    }

    @Override
    public int getCount() {
        return pageNumber;
    }
}
