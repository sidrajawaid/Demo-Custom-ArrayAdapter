package com.example.sidra.customarrayadapter;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Sidra on 10/11/2017.
 */

public class customClass extends ArrayAdapter<String> {

String[] data;
    int[] img;


    public customClass(@NonNull Context context, String[] data, int[] img) {
        super(context, R.layout.customlayout,R.id.textview,data);
        this.data = data;
        this.img = img;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater layout_inflater=(LayoutInflater.from(getContext()));
        View custom_view=layout_inflater.inflate(R.layout.customlayout,parent,false);


        ImageView image_view=(ImageView)custom_view.findViewById(R.id.imageview);
        TextView text_view=(TextView)custom_view.findViewById(R.id.textview);


        image_view.setImageResource(img[position]);
        text_view.setText(data[position]);


        return custom_view;


    }
}
