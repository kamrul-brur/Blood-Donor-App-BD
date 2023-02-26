package com.example.blood_donor_app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class ShowDataCustomAdapter extends BaseAdapter implements Filterable {

    private List<SaveDataHelper> donorList;
    private List<SaveDataHelper> donorListFiltered;
    private Activity context;

    public ShowDataCustomAdapter(List<SaveDataHelper> donorList, Activity context) {
        this.donorList = donorList;
        this.donorListFiltered = donorList;
        this.context = context;
    }

    @Override
    public int getCount() {
        return donorListFiltered.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater layoutInflater = context.getLayoutInflater();
        ///View view = layoutInflater.inflate(R.layout.showlist_layout,null,true);
        @SuppressLint({"InflateParams", "ViewHolder"}) View view = layoutInflater.inflate(R.layout.showlist_layout, null, true);

        TextView name = view.findViewById(R.id.nameTextviewID);
        TextView bloodgroup = view.findViewById(R.id.bloodgroupTextviewID);
        TextView district = view.findViewById(R.id.districtTextviewID);
        TextView phone = view.findViewById(R.id.phoneTextviewID);

        name.setText(donorListFiltered.get(position).getName());
        bloodgroup.setText(donorListFiltered.get(position).getBloodgroup());
        district.setText(donorListFiltered.get(position).getDistrict());
        phone.setText(donorListFiltered.get(position).getPhone());

        return view;
    }

    @Override
    public Filter getFilter() {

        return new Filter() {
            @Override
            protected FilterResults performFiltering(CharSequence constraint) {
                FilterResults filterResults = new FilterResults();
                if (constraint == null || constraint.length() == 0) {
                    filterResults.count = donorList.size();
                    filterResults.values = donorList;
                } else {
                    String str = constraint.toString().toUpperCase();
                    List<SaveDataHelper> resultList = new ArrayList<>();
                    for (SaveDataHelper saveDataHelper : donorList) {
                        if (saveDataHelper.getBloodgroup().contains(str) || saveDataHelper.getDistrict().contains(str)) {
                            resultList.add(saveDataHelper);
                        }
                        filterResults.count = resultList.size();
                        filterResults.values = resultList;
                    }

                }


                return filterResults;
            }

            @Override
            protected void publishResults(CharSequence constraint, FilterResults results) {
                donorListFiltered = (List<SaveDataHelper>) results.values;
                notifyDataSetChanged();
            }
        };
    }
}