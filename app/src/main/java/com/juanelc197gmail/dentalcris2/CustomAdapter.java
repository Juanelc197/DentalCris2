package com.juanelc197gmail.dentalcris2;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomAdapter extends BaseAdapter {

    Context context;
    int[] Images;
    String[] Names;
    LayoutInflater inflter;

    public CustomAdapter(Context applicationContext, String[] Names, int[] Images) {
        this.context = applicationContext;
        this.Images = Images;
        this.Names = Names;
        inflter = (LayoutInflater.from(applicationContext));
    }

    @Override
    public int getCount() {
        return Names.length;
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
    public View getView(int position, View view, ViewGroup parent) {
        view = inflter.inflate(R.layout.list_item, null);
        TextView NameG = (TextView) view.findViewById(R.id.name);
        ImageView ImageG = (ImageView) view.findViewById(R.id.image);
        NameG.setText(Names[position]);
        ImageG.setImageResource(Images[position]);
        return view;
    }
}
