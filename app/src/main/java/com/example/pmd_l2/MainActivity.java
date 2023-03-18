package com.example.pmd_l2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;


import java.util.ArrayList;


public class MainActivity extends AppCompatActivity implements RecycleViewInreface {

    ArrayList<Details> info = new ArrayList<>();

    private void setupinfo() {
        info.add(new Details("Рик Санчез", R.drawable.ricksanchez, getResources().getString(R.string.ricksanchezdetails)));
        info.add(new Details("Диана Санчез", R.drawable.dianasanchez, getResources().getString(R.string.ricksanchezdetails)));
        info.add(new Details("Морти Смит", R.drawable.mortismith, getResources().getString(R.string.ricksanchezdetails)));
        info.add(new Details("Говорящий кот", R.drawable.talkingcat, getResources().getString(R.string.ricksanchezdetails)));
        info.add(new Details("Бет Смит", R.drawable.betsmith, getResources().getString(R.string.ricksanchezdetails)));
        info.add(new Details("Рик Прайм", R.drawable.rickprime, getResources().getString(R.string.ricksanchezdetails)));
        info.add(new Details("Огурчик Рик", R.drawable.ogurchik, getResources().getString(R.string.ricksanchezdetails)));
        info.add(new Details("Брэд", R.drawable.brad, getResources().getString(R.string.ricksanchezdetails)));
        info.add(new Details("Злой Морти", R.drawable.evilmorty, getResources().getString(R.string.ricksanchezdetails)));
        info.add(new Details("MC Хапс", R.drawable.mchaps, getResources().getString(R.string.ricksanchezdetails)));
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setTitle("Рик и Морти");


        setupinfo();

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.addItemDecoration(new SpacesItemDecoration(50));
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        recyclerView.setHasFixedSize(true);


        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration
                (this, DividerItemDecoration.VERTICAL);
        recyclerView.addItemDecoration(dividerItemDecoration);


        MyAdapter adapter = new MyAdapter(MainActivity.this, info.toArray(new Details[info.size()]), this);
        recyclerView.setAdapter(adapter);
    }


    @Override
    public void onItemClick(int position) {
        Intent intent = new Intent(this, MainActivity2.class);

        intent.putExtra("NAME", info.get(position).getName());
        intent.putExtra("IMAGE", info.get(position).getImage());
        intent.putExtra("DESCRIPTION", info.get(position).getDescription());


        startActivity(intent);
    }

}