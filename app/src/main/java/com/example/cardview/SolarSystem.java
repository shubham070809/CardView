package com.example.cardview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.ArrayList;

public class SolarSystem extends AppCompatActivity {

    RecyclerView solarSysRV;
    ImageView backButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_solar_system);

        solarSysRV=(RecyclerView)findViewById(R.id.solarSysRV);
        solarSysRV.setLayoutManager(new LinearLayoutManager(this));
        solarSysRV.setHasFixedSize(true);

        backButton=(ImageView)findViewById(R.id.backButton);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        ArrayList<String> al=new ArrayList<>();
        // Code with harry se uthaya hai
        al.add("libKVRa01L8");
//        al.add("PoBePPh5Iko");
//        al.add("HHaghq5wXic");
//        al.add("jUmqYE2iWiI");
//        al.add("WVjqX1BoQeM");
//        al.add("n_S2myhVPww");
//        al.add("u5NZ3SKx-q4I");
//        al.add("pfypXyKtCH8");
//        al.add("iwHP7vMd8");
//        al.add("ux4Etu6M2-Dk");

        MyAdapterCourseVideo adapter=new MyAdapterCourseVideo(al);
        solarSysRV.setAdapter(adapter);
    }
}