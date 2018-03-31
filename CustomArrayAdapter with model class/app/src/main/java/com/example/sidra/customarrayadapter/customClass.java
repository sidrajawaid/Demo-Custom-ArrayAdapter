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

import java.util.ArrayList;

/**
 * Created by Sidra on 10/11/2017.
 */

public class customClass extends ArrayAdapter<ModelClass> {


    public customClass(@NonNull Context context, ArrayList<ModelClass> modelClassArrayList) {
        super(context,0,modelClassArrayList);
    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater layout_inflater=(LayoutInflater.from(getContext()));
        View custom_view=layout_inflater.inflate(R.layout.customlayout,parent,false);
        ModelClass heremodelclass=getItem(position);
        ImageView image_view=(ImageView)custom_view.findViewById(R.id.image);
        TextView text_view1=(TextView)custom_view.findViewById(R.id.song_name);
        TextView text_view2=(TextView)custom_view.findViewById(R.id.singer_name);
        image_view.setImageResource(heremodelclass.getmImage());
        text_view1.setText(heremodelclass.getmSinger());
        text_view2.setText(heremodelclass.getmSong());
        return custom_view;


    }
}
