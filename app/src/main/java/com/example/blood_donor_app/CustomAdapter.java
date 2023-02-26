package com.example.blood_donor_app;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomAdapter extends BaseAdapter {
    Context context;
    int[] gridimages;
    String[] gridlist;
    private LayoutInflater layoutInflater;

    public CustomAdapter(Context context,String[] gridlist, int[] gridimages) {
        this.context = context;
        this.gridimages = gridimages;
        this.gridlist = gridlist;
    }

    @Override
    public int getCount() {
        return gridlist.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView==null){
            layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = layoutInflater.inflate(R.layout.sample_view,parent,false);
        }
        ImageView imageView = convertView.findViewById(R.id.imageviewID);
        TextView textView = convertView.findViewById(R.id.textviewID);
        imageView.setImageResource(gridimages[position]);
        textView.setText(gridlist[position]);
        return convertView;
    }
}
