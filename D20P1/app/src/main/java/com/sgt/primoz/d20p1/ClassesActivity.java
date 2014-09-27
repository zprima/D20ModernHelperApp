package com.sgt.primoz.d20p1;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import com.sgt.primoz.d20p1.DClasses.DClass;
import com.sgt.primoz.d20p1.DClasses.DConstants;
import com.sgt.primoz.d20p1.DClasses.DContainer;
import com.sgt.primoz.d20p1.DClasses.DFeat;
import com.sgt.primoz.d20p1.ListAdapters.ClassesListAdapter;


public class ClassesActivity extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_classes);

        if(findViewById(R.id.classes_container)!=null){
            if(savedInstanceState!=null){
                return;
            }
            ClassesFragment f = new ClassesFragment();
            getSupportFragmentManager()
                    .beginTransaction()
                    .add(R.id.classes_container,f)
                    .commit();
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.classes, menu);
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

    public static class ClassesFragment extends ListFragment{
        public ClassesFragment(){}

        public final static String CLASS_POSITION = "class_position";

        @Override
        public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.list_layout,container,false);
            ClassesListAdapter adapter = new ClassesListAdapter(inflater.getContext(), DContainer.getClasses());
            setListAdapter(adapter);
            return rootView;
        }

        @Override
        public void onListItemClick(ListView l, View v, int position, long id) {
            Fragment f = new ClassFragment();
            Bundle args = new Bundle();
            args.putInt(CLASS_POSITION,position);
            f.setArguments(args);

            FragmentTransaction transaction = getFragmentManager().beginTransaction();
            transaction.replace(R.id.classes_container,f);
            transaction.addToBackStack(null);
            transaction.commit();
        }
    }

    public static class ClassFragment extends Fragment{
        public ClassFragment(){}

        @Override
        public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_class, container, false);
            Bundle args = getArguments();
            Integer position = args.getInt(ClassesFragment.CLASS_POSITION);
            DClass c = DContainer.classes.get(position);
            ((TextView) rootView.findViewById(R.id.cName)).setText(c.name);
            ((TextView) rootView.findViewById(R.id.cDescription)).setText(c.description);
            ((TextView) rootView.findViewById(R.id.cHeroContent)).setText(c.heroContent);
            if(c.isBasic) {
                ((TextView) rootView.findViewById(R.id.cType)).setText(DConstants.BASIC);
                ((TextView) rootView.findViewById(R.id.cType)).setTextColor(getResources().getColor(R.color.green));
            }
            else {
                ((TextView) rootView.findViewById(R.id.cType)).setText(DConstants.ADVANCE);
                ((TextView) rootView.findViewById(R.id.cType)).setTextColor(getResources().getColor(R.color.red));
            }
            return rootView;
        }

    }
}
