package com.example.meetup;

import android.content.Context;
import android.content.Intent;
import android.graphics.ColorSpace;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MyAdapter_Home extends RecyclerView.Adapter<MyHolder_Home> {
    Context c;
    ArrayList<Model_Home> models;

    public MyAdapter_Home(Context c, ArrayList<Model_Home> models) {
        this.c = c;
        this.models = models;
    }

    @NonNull
    @Override
    public MyHolder_Home onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_home,null);


        return new MyHolder_Home(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyHolder_Home holder, int position) {
        holder.mTitle.setText(models.get(position).getTitle());
        holder.mDescription.setText(models.get(position).getDescription());
        holder.setItemClickListener(new ItemClickListenerHome() {
            @Override
            public void onItemClickListener(View v, int position) {
                String gTitle = models.get(position).getTitle();
                String gDescription = models.get(position).getDescription();
                Intent intent = new Intent(c, EventActivity.class);
                intent.putExtra("iTitle",gTitle);
                intent.putExtra("iDescription",gDescription);
                c.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return models.size();
    }
}
