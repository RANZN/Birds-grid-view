package com.ranzan.birdsgridview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class BirdAdapter extends RecyclerView.Adapter<BirdViewHolder> {
    private ArrayList<Bird> birdList = new ArrayList<>();
    private ItemClickListner itemClickListner;

    public BirdAdapter(ArrayList<Bird> birdList,
                       ItemClickListner itemClickListner) {
        this.birdList = birdList;
        this.itemClickListner = itemClickListner;
    }

    @NonNull

    @Override

    public BirdViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_view, parent, false);
        return new BirdViewHolder(view, itemClickListner);
    }

    @Override
    public void onBindViewHolder(@NonNull BirdViewHolder holder, int position) {
        Bird bird = birdList.get(position);
        holder.setData(bird);

    }

    @Override
    public int getItemCount() {
        return birdList.size();
    }
}

