package com.sgt.primoz.d20p1.ListAdapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.sgt.primoz.d20p1.DClasses.DMenuItem;
import com.sgt.primoz.d20p1.R;

import java.util.List;

/**
 * Created by Primoz on 21.9.2014.
 */
public class MainMenuListAdapter extends ArrayAdapter<DMenuItem>{
    Context context;
    List<DMenuItem> items;
    private static class ViewHolder{
        TextView menuItemLabel;
    }

    public MainMenuListAdapter(Context context, List<DMenuItem> objects) {
        super(context, R.layout.simplelabellayout, objects);
        this.context = context;
        this.items = objects;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;
        if(convertView==null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.simplelabellayout,parent,false);
            viewHolder = new ViewHolder();
            viewHolder.menuItemLabel = (TextView)convertView.findViewById(R.id.simpleLabel);
            convertView.setTag(viewHolder);
        }
        else{
            viewHolder = (ViewHolder)convertView.getTag();
        }

        DMenuItem item = getItem(position);
        viewHolder.menuItemLabel.setText(item.name);

        return convertView;
    }
}
