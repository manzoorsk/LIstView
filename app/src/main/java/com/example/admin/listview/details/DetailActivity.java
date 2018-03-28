package com.example.admin.listview.details;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toolbar;

import com.example.admin.listview.R;

public class DetailActivity extends AppCompatActivity {

    TextView text_name;
    ImageView image_baloon;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        text_name=(TextView)findViewById(R.id.text_name);
        image_baloon=(ImageView)findViewById(R.id.image_baloon);
        Intent i=this.getIntent();
        String name=i.getExtras().getString("NAME_KEY");
        int image=i.getExtras().getInt("IMAGE_KEY");
        text_name.setText(name);
        image_baloon.setImageResource(image);
    }


}
