package com.example.jack.testarinfo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.jack.testarinfo.activity.SecondActivity;

public class MainActivity extends AppCompatActivity {

    Button btnget;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnget = findViewById(R.id.btnget);
        btnget.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent get = new Intent(MainActivity.this, SecondActivity.class);
                Toast.makeText(getApplicationContext(),"you fetch the new data",Toast.LENGTH_SHORT).show();
                startActivity(get);
            }
        });
    }
}
