package com.hfad.bitsandpizzas;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.fragment.app.FragmentTransaction;

 class SectionsPagerAdapter extends FragmentPagerAdapter {
    public SectionsPagerAdapter(FragmentManager fm) {
        super(fm);
    }


    @Override
    public Fragment getItem(int position) {
       switch (position) {
           case 0:
               return new TopFragment();
           case 1: return new PizzaFragment();
           case 2: return  new PastaFragment();
           case 3: return  new StoresFragment();
       }
       return null;
    }

    @Override
    public int getCount() {
        return 4;
    }
}
