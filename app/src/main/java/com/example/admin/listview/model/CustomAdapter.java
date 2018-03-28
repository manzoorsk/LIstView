package com.example.admin.listview.model;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.admin.listview.details.DetailActivity;
import com.example.admin.listview.R;
import com.example.admin.listview.SpaceCraft;

import java.util.ArrayList;

/**
 * Created by admin on 10/17/2016.
 */
public class CustomAdapter extends BaseAdapter {

    Context context;
    ArrayList<SpaceCraft>spaceCrafts;
    LayoutInflater inflater;

    public CustomAdapter(Context context, ArrayList<SpaceCraft> spaceCrafts) {
        this.context = context;
        this.spaceCrafts = spaceCrafts;

        inflater= (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return spaceCrafts.size();
    }

    @Override
    public Object getItem(int position) {
        return spaceCrafts.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {

        if(view==null){
            view=inflater.inflate(R.layout.model,viewGroup,false);
        }
        TextView nameText=(TextView)view.findViewById(R.id.text_view);
        ImageView imageView=(ImageView)view.findViewById(R.id.image_view);

        final String name=spaceCrafts.get(position).getName();
        final int image=spaceCrafts.get(position).getImage();

        nameText.setText(name);
        imageView.setImageResource(image);

        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDetailActivity(name,image);
            }
        });


        return view;
    }
    private void openDetailActivity(String name,int image){
        Intent i=new Intent(context,DetailActivity.class);
       i.putExtra("NAME_KEY",name);
       i.putExtra("IMAGE_KEY",image);
        context.startActivity(i);

    }
}
