package com.sgt.primoz.d20p1.ListAdapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.sgt.primoz.d20p1.DClasses.DAbility;
import com.sgt.primoz.d20p1.DClasses.DMenuItem;
import com.sgt.primoz.d20p1.R;

import java.util.List;

/**
 * Created by Primoz on 21.9.2014.
 */
public class AbilitiesListAdapter extends ArrayAdapter<DAbility> {
    Context context;
    List<DAbility> items;
    private static class ViewHolder{
        TextView label;
    }

    public AbilitiesListAdapter(Context context, List<DAbility> objects) {
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
            viewHolder.label = (TextView)convertView.findViewById(R.id.simpleLabel);
            convertView.setTag(viewHolder);
        }
        else{
            viewHolder = (ViewHolder)convertView.getTag();
        }

        DAbility item = getItem(position);
        viewHolder.label.setText(item.name);

        return convertView;
    }
}
