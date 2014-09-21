package com.sgt.primoz.d20p1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.sgt.primoz.d20p1.DClasses.DConstants;
import com.sgt.primoz.d20p1.DClasses.DContainer;
import com.sgt.primoz.d20p1.DClasses.DMenuItem;
import com.sgt.primoz.d20p1.ListAdapters.MainMenuListAdapter;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DContainer.initMenu();

        MainMenuListAdapter adapter = new MainMenuListAdapter(this,DContainer.menu);
        ListView listView = (ListView)findViewById(R.id.menuListView);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(onItemClickListener);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
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

    public AdapterView.OnItemClickListener onItemClickListener = new AdapterView.OnItemClickListener() {
        public void onItemClick(AdapterView parent, View v, int position, long id) {
            DMenuItem menuItem = DContainer.menu.get(position);

            if(menuItem.keyword == DConstants.ABILITIES){
                Intent intent = new Intent(getApplicationContext(), AbilitiesActivity.class);
                startActivity(intent);
            }
            else if(menuItem.keyword == DConstants.FEATS){
                Intent intent = new Intent(getApplicationContext(), FeatsActivity.class);
                startActivity(intent);
            }

        }
    };
}
