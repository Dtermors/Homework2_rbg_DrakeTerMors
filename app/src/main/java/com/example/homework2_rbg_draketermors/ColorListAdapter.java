package com.example.homework2_rbg_draketermors;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class ColorListAdapter extends BaseAdapter
{
    MainActivity m = new MainActivity();
    Context context;
    ArrayList<ColorInfo> listOfColor;
    public  ColorListAdapter(Context c, ArrayList<ColorInfo> ls)
    {
        context = c;
        listOfColor = ls;
    }
    @Override
    public int getCount()
    {
        return listOfColor.size();
    }

    @Override
    public Object getItem(int i)
    {
        return listOfColor.get(i);
    }

    @Override
    public long getItemId(int i)
    {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup)
    {
        if (view == null)
        {
            LayoutInflater mInflator = (LayoutInflater) context.getSystemService(MainActivity.LAYOUT_INFLATER_SERVICE);
            view = mInflator.inflate(R.layout.custom_cell, null);
        }
        //find ui elements
        TextView rgblist = view.findViewById(R.id.tv_v_cc_rgb);
        TextView hexlist = view.findViewById(R.id.tv_v_cc_hex);

        //grab data from list
        ColorInfo col = listOfColor.get(i);

        //set gui
        rgblist.setText("Red: " + col.getStoreRed() + "Green: " + col.getStoreGreen() + "Blue: " + col.getStoreBlue());
        hexlist.setText(col.getStoreHex());

        return view;
    }
}
