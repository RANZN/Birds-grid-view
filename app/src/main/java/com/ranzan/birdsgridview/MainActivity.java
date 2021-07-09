package com.ranzan.birdsgridview;

import android.os.Bundle;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements ItemClickListner {
    private ArrayList<Bird> birdList = new ArrayList<>();
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        buildData();
        setRecyclerView();
    }

    private void setRecyclerView() {
        BirdAdapter birdAdapter = new BirdAdapter(birdList, this);
        StaggeredGridLayoutManager staggeredGridLayoutManager=new StaggeredGridLayoutManager(4,StaggeredGridLayoutManager.VERTICAL);
        recyclerView.setAdapter(birdAdapter);
        recyclerView.setLayoutManager(staggeredGridLayoutManager);

    }

    private void buildData() {
        Bird eagle = new Bird(R.drawable.eagle, "Eagle");
        Bird crow = new Bird(R.drawable.crow, "Crow");
        Bird peacock = new Bird(R.drawable.peacock, "Peacock");
        Bird parrot = new Bird(R.drawable.parrot, "Parrot");
        for (int i = 0; i < 100; i++) {
            if (i % 4 == 0) birdList.add(eagle);
            else if (i % 4 == 1) birdList.add(crow);
            else if (i % 4 == 2) birdList.add(parrot);
            else if (i % 4 == 3) birdList.add(peacock);
        }

    }

    public void init() {
        recyclerView = findViewById(R.id.recyclerView);
    }


    @Override
    public void onItemClick(Bird bird, int position) {
        new AlertDialog.Builder(this)
                .setTitle(bird.getName())
                .show();
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}