package com.ranzan.birdsgridview;

import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class BirdViewHolder extends RecyclerView.ViewHolder {
    private TextView name;
    private ImageView image;
    private ItemClickListner itemClickListner;
    private RelativeLayout relativeLayout;

    public BirdViewHolder(@NonNull View itemView, ItemClickListner itemClickListner) {
        super(itemView);
        this.itemClickListner = itemClickListner;
        init(itemView);
    }

    public void setData(Bird bird) {
        image.setImageResource(bird.getImageId());
        relativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                itemClickListner.onItemClick(bird, getAdapterPosition());
            }
        });

    }

    private void init(View itemView) {
        image = itemView.findViewById(R.id.img);
        relativeLayout = itemView.findViewById(R.id.layout);
    }
}
