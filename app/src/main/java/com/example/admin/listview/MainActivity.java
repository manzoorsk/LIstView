package com.example.admin.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.admin.listview.model.CustomAdapter;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ListView list_view=(ListView)findViewById(R.id.list_view);

        CustomAdapter adapter=new CustomAdapter(this,SpaceCraftsCollection.getSpaceCrafts());
        list_view.setAdapter(adapter);
    }


}
