package com.example.cardview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView = findViewById(R.id.recyclerView);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        mRecyclerView.setHasFixedSize(true);

        ArrayList<DataModel> dataModels = new ArrayList<>();
        dataModels.add(new DataModel(R.drawable.android , "ANDROID STUDIO BY "));
        dataModels.add(new DataModel(R.drawable.apti , "APTITUDE BY"));
        dataModels.add(new DataModel(R.drawable.java , "JAVA BY"));
        dataModels.add(new DataModel(R.drawable.shapes , "SHAPES"));
        dataModels.add(new DataModel(R.drawable.solarsystem , "SOLAR SYSTEM BY"));

        MyAdapter adapter = new MyAdapter(dataModels,getApplicationContext());
        mRecyclerView.setAdapter(adapter);
    }
}