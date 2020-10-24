package com.example.meetup;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyHolder_Home extends RecyclerView.ViewHolder implements View.OnClickListener{
    TextView mTitle, mDescription;
    ItemClickListenerHome itemClickListener;
    public MyHolder_Home(@NonNull View itemView) {
        super(itemView);
        this.mTitle = itemView.findViewById(R.id.titleTV);
        this.mDescription = itemView.findViewById(R.id.descriptionTV);
        itemView.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        this.itemClickListener.onItemClickListener(v, getLayoutPosition());
    }
    public void setItemClickListener(ItemClickListenerHome ic){
        this.itemClickListener=ic;
    }

}
