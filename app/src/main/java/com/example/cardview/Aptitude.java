package com.example.cardview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.ArrayList;

public class Aptitude extends AppCompatActivity {

    RecyclerView aptiRV;
    ImageView backButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aptitude);

        aptiRV=(RecyclerView)findViewById(R.id.aptiRV);
        aptiRV.setLayoutManager(new LinearLayoutManager(this));
        aptiRV.setHasFixedSize(true);

        backButton=(ImageView)findViewById(R.id.backButton);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        ArrayList<String> al=new ArrayList<>();
        // Code with harry se uthaya hai
        al.add("lxm6ez2cx6Y");
        al.add("oGT0AOihPr8");
        al.add("TG1wkNzIhjQ");
        al.add("DaNnu8BqzCM");
        al.add("EoxD3-5Rl18");
        al.add("f3wC8fjMV9");
        al.add("vbFR4MS2Hfc");
        al.add("CXJd8Le_0Qg");
        al.add("aYedpW5vCh0");
        al.add("_cW7_BUDYcw");

        MyAdapterCourseVideo adapter=new MyAdapterCourseVideo(al);
        aptiRV.setAdapter(adapter);
    }
}