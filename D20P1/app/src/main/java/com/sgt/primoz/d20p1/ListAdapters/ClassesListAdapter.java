package com.sgt.primoz.d20p1.ListAdapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.sgt.primoz.d20p1.DClasses.DClass;
import com.sgt.primoz.d20p1.DClasses.DConstants;
import com.sgt.primoz.d20p1.DClasses.DContainer;
import com.sgt.primoz.d20p1.DClasses.DMenuItem;
import com.sgt.primoz.d20p1.R;

import java.util.List;

/**
 * Created by Primoz on 27.9.2014.
 */
public class ClassesListAdapter extends ArrayAdapter<DClass> {
    Context context;
    List<DClass> items;
    private static class ViewHolder{
        TextView className;
        TextView classType;
    }

    public ClassesListAdapter(Context context, List<DClass> items) {
        super(context, R.layout.class_list_layout, items);
        this.context = context;
        this.items = items;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;
        if(convertView==null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.class_list_layout,parent,false);
            viewHolder = new ViewHolder();
            viewHolder.className = (TextView)convertView.findViewById(R.id.className);
            viewHolder.classType = (TextView)convertView.findViewById(R.id.classType);
            convertView.setTag(viewHolder);
        }
        else{
            viewHolder = (ViewHolder)convertView.getTag();
        }

        DClass c = DContainer.classes.get(position);
        viewHolder.className.setText(c.name);
        if(c.isBasic) {
            viewHolder.classType.setText(DConstants.BASIC);
            viewHolder.classType.setTextColor(context.getResources().getColor(R.color.green));
        }
        else {
            viewHolder.classType.setText(DConstants.ADVANCE);
            viewHolder.classType.setTextColor(context.getResources().getColor(R.color.red));
        }

        return convertView;
    }
}
