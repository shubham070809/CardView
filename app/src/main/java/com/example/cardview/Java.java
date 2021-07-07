package com.example.cardview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.ArrayList;

public class Java extends AppCompatActivity {

    RecyclerView javaRV;
    ImageView backButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java);

        javaRV=(RecyclerView)findViewById(R.id.javaRV);
        javaRV.setLayoutManager(new LinearLayoutManager(this));
        javaRV.setHasFixedSize(true);

        backButton=(ImageView)findViewById(R.id.backButton);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        ArrayList<String> al=new ArrayList<>();
        // Code with harry se uthaya hai
        al.add("lxja8wBwN0k");
        al.add("IwImJwo9gQ8");
        al.add("_RBYk-4fdcs");
        al.add("nDcoKPOCgBk");
        al.add("XAIANobGkXI");
        al.add("GvKZXeJsXXs");
        al.add("RAPFJuoKVq0");
        al.add("CQObr2ns_FM");
        al.add("JKn-eVofOpQ");
        al.add("Oxy96n-bCK8");

        MyAdapterCourseVideo adapter=new MyAdapterCourseVideo(al);
        javaRV.setAdapter(adapter);
    }
}