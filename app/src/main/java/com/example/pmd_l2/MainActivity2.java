package com.example.pmd_l2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    TextView tvView;
    ImageView imgView;
    TextView description;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intent = getIntent();

        tvView = findViewById(R.id.tvView);
        imgView = findViewById(R.id.imgView);
        description = findViewById(R.id.description);

        int Img = intent.getIntExtra("IMAGE", 0);
        imgView.setImageResource(Img);

        String Name = intent.getStringExtra("NAME");
        tvView.setText(Name);

        String descrip= intent.getStringExtra("DESCRIPTION");
        description.setText(descrip);

    }


}