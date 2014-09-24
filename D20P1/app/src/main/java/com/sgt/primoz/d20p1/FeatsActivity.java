package com.sgt.primoz.d20p1;

import android.app.Activity;
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
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.sgt.primoz.d20p1.DClasses.DAbility;
import com.sgt.primoz.d20p1.DClasses.DContainer;
import com.sgt.primoz.d20p1.DClasses.DFeat;
import com.sgt.primoz.d20p1.ListAdapters.FeatsListAdapter;


public class FeatsActivity extends FragmentActivity {
    ViewPager viewPager;
    FeatsPagerAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feats);

        adapter = new FeatsPagerAdapter(getSupportFragmentManager());

        viewPager = (ViewPager)findViewById(R.id.feats_pager);
        viewPager.setAdapter(adapter);
        /*viewPager.setOnPageChangeListener(new ViewPager.SimpleOnPageChangeListener(){
            @Override
            public void onPageSelected(int position) {
                actionBar.setSelectedNavigationItem(position);
            }
        });*/

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.feats, menu);
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

    public class FeatsPagerAdapter extends FragmentPagerAdapter {

        public FeatsPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public android.support.v4.app.Fragment getItem(int i) {
            android.support.v4.app.Fragment f = new FeatsFragment();
            Bundle args = new Bundle();
            args.putInt(FeatsFragment.FEAT_POSITION,i);
            f.setArguments(args);
            return f;
        }

        @Override
        public int getCount() {
            return DContainer.getFeats().size();
        }

    }

    public static class FeatsFragment extends android.support.v4.app.ListFragment {

        public static final String FEAT_POSITION = "feat_position";

        public FeatsFragment() {}

        @Override
        public void onListItemClick(ListView l, View v, int position, long id) {
            super.onListItemClick(l, v, position, id);
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {

            View rootView = inflater.inflate(R.layout.fragment_feats, container, false);
            FeatsListAdapter featsListAdapter = new FeatsListAdapter(inflater.getContext(),DContainer.getFeats());
            setListAdapter(featsListAdapter);

           /*MainMenuListAdapter adapter = new MainMenuListAdapter(this,DContainer.menu);
            ListView listView = (ListView)findViewById(R.id.menuListView);
            listView.setAdapter(adapter);
            listView.setOnItemClickListener(onItemClickListener);*/

            //Bundle args = getArguments();
            //Integer tab_position = args.getInt(ARG_TAB_POSITION);
            //DAbility ability = DContainer.abilities.get(tab_position);

            //((TextView) rootView.findViewById(R.id.abilityName)).setText(ability.name);
            //((TextView) rootView.findViewById(R.id.abilityDescription)).setText(ability.description);

            return rootView;
        }
    }
}
