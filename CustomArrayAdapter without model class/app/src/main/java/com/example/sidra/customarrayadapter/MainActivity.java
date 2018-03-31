package com.example.sidra.customarrayadapter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final String[] foods={"sidra","sidra","sidra","sidra"};
        int[] imgs={
             R.drawable.color_brown,
        R.drawable.color_gray,
                R.drawable.color_mustard_yellow,
                R.drawable.color_red

        };
        ListAdapter list_adapter=new customClass(this,foods,imgs);
        ListView list_view=(ListView)findViewById(R.id.listview);
        list_view.setAdapter(list_adapter);

        list_view.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this,foods[position],Toast.LENGTH_SHORT).show();
            }
        });
    }
}
