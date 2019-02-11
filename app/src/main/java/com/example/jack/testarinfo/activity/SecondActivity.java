package com.example.jack.testarinfo.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.jack.testarinfo.R;
import com.example.jack.testarinfo.adapter.Adapter;
import com.example.jack.testarinfo.model.Model;
import com.example.jack.testarinfo.services.BackgroundTask;

import java.util.ArrayList;

public class SecondActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    RecyclerView.Adapter adapter;
    RecyclerView.LayoutManager layoutManager;
    ArrayList<Model> arrayList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        recyclerView =findViewById(R.id.recyclerview);
        layoutManager= new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);

        BackgroundTask backgroundTask = new BackgroundTask(SecondActivity.this);
        arrayList =backgroundTask.getList();
        adapter = new Adapter(arrayList,getApplicationContext());
        recyclerView.setAdapter(adapter);
    }
}
