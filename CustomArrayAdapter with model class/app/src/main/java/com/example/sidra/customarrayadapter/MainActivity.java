package com.example.sidra.customarrayadapter;

import android.media.MediaPlayer;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mp=new MediaPlayer();
        // App starting ring
        /*MediaPlayer ring= MediaPlayer.create(MainActivity.this,R.raw.ring);
        ring.start();*/
        //File path=android.os.Environment.getExternalStorageDirectory();
        /*try {
            mp.setDataSource(path+"sia.mp3");
        } catch (IOException e) {
            e.printStackTrace();
        }*/
        final int[] singer_name={R.string.singer_1,R.string.singer_2,R.string.singer_3,R.string.singer_4};
        int[] song_name={R.string.song_1,R.string.song_2,R.string.song_3,R.string.song_4};
        int[] song_image={R.drawable.despacito,R.drawable.everyight,R.drawable.cheapthrills,R.drawable.shapeofyou};
        ArrayList<ModelClass> modelClassArrayList=new ArrayList<ModelClass>();
        modelClassArrayList.add(new ModelClass(R.string.singer_1,R.string.song_1,R.drawable.despacito));
        modelClassArrayList.add(new ModelClass(R.string.singer_2,R.string.song_2,R.drawable.everyight));
        modelClassArrayList.add(new ModelClass(R.string.singer_3,R.string.song_3,R.drawable.cheapthrills));
        modelClassArrayList.add(new ModelClass(R.string.singer_4,R.string.song_4,R.drawable.shapeofyou));

        customClass customClass=new customClass(this,modelClassArrayList);
        final ListView list_view=(ListView)findViewById(R.id.listview);
        list_view.setAdapter(customClass);

        list_view.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //Toast.makeText(MainActivity.this,singer_name[position],Toast.LENGTH_SHORT).show();
                /*if(list_view.getItemIdAtPosition(position)==1)
                {
                    try {
                        mp.setDataSource(Environment.getExternalStorageDirectory().getPath()+"sia.mp3");
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }*/
                /*if(position==1)
                {
                    try {
                        mp.setDataSource(Environment.getExternalStorageDirectory().getPath()+"sia.mp3");
                    } catch (IOException e) {
                        //e.printStackTrace();
                        Toast.makeText(MainActivity.this,position,Toast.LENGTH_SHORT).show();
                    }
                }*/
                mp=MediaPlayer.create(MainActivity.this,R.raw.sia);
                mp.start();
            }
        });
        
    }
}
