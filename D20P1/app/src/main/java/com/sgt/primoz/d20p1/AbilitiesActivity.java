package com.sgt.primoz.d20p1;

import android.app.ActionBar;
import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.sgt.primoz.d20p1.DClasses.DAbility;
import com.sgt.primoz.d20p1.DClasses.DContainer;

public class AbilitiesActivity extends FragmentActivity implements ActionBar.TabListener {
    ViewPager viewPager;
    AbilitiesPagerAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abilities);

        adapter = new AbilitiesPagerAdapter(getSupportFragmentManager());
        final ActionBar actionBar = getActionBar();
        actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);

        viewPager = (ViewPager)findViewById(R.id.pager);
        viewPager.setAdapter(adapter);
        viewPager.setOnPageChangeListener(new ViewPager.SimpleOnPageChangeListener(){
            @Override
            public void onPageSelected(int position) {
                actionBar.setSelectedNavigationItem(position);
            }
        });

        for(int i=0;i<adapter.getCount();i++){
            actionBar.addTab(
                actionBar.newTab()
                    .setText(adapter.getPageTitle(i))
                    .setTabListener(this)
            );
        }

        //if (savedInstanceState == null) {
        //    getFragmentManager().beginTransaction()
        //            .add(R.id.container, new PlaceholderFragment())
        //            .commit();
        //}
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.abilities, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onTabSelected(ActionBar.Tab tab, FragmentTransaction fragmentTransaction) {
        viewPager.setCurrentItem(tab.getPosition());
    }

    @Override
    public void onTabUnselected(ActionBar.Tab tab, FragmentTransaction fragmentTransaction) {

    }

    @Override
    public void onTabReselected(ActionBar.Tab tab, FragmentTransaction fragmentTransaction) {

    }

    public class AbilitiesPagerAdapter extends FragmentStatePagerAdapter {

        public AbilitiesPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public android.support.v4.app.Fragment getItem(int i) {
            android.support.v4.app.Fragment f = new AbilityFragment();
            Bundle args = new Bundle();
            args.putInt(AbilitiesActivity.AbilityFragment.ARG_TAB_POSITION,i);
            f.setArguments(args);
            return f;
        }

        @Override
        public int getCount() {
            return DContainer.getAbilities().size();
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return DContainer.abilities.get(position).name;
        }
    }

    public static class AbilityFragment extends android.support.v4.app.Fragment {

        public static final String ARG_TAB_POSITION = "tab_position";

        public AbilityFragment() {}

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {

            View rootView = inflater.inflate(R.layout.fragment_abilities, container, false);
            Bundle args = getArguments();
            Integer tab_position = args.getInt(ARG_TAB_POSITION);
            DAbility ability = DContainer.abilities.get(tab_position);

            ((TextView) rootView.findViewById(R.id.abilityName)).setText(ability.name);
            ((TextView) rootView.findViewById(R.id.abilityDescription)).setText(ability.description);

            return rootView;
        }
    }

}
