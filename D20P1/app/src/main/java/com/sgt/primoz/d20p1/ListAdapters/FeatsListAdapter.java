package com.sgt.primoz.d20p1.ListAdapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.sgt.primoz.d20p1.DClasses.DAbility;
import com.sgt.primoz.d20p1.DClasses.DFeat;
import com.sgt.primoz.d20p1.R;

import java.util.List;

/**
 * Created by Primoz on 24.9.2014.
 */
public class FeatsListAdapter extends ArrayAdapter<DFeat> {
    Context context;
    List<DFeat> items;
    private static class ViewHolder{
        TextView label;
    }

    public FeatsListAdapter(Context context, List<DFeat> objects) {
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

        DFeat item = getItem(position);
        viewHolder.label.setText(item.name);

        return convertView;
    }
}