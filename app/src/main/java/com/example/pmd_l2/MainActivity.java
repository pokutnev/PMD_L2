package com.example.pmd_l2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;


import java.util.ArrayList;



public class MainActivity extends AppCompatActivity implements RecycleViewInreface{

    ArrayList<Details> info = new ArrayList<>();
    ArrayList<Details> info2 = new ArrayList<>();

    private void setupinfo(){
        info.add(new Details("Рик Санчез", R.drawable.ricksanchez));
        info.add(new Details("Диана Санчез", R.drawable.dianasanchez));
        info.add(new Details("Морти Смит", R.drawable.mortismith));
        info.add(new Details("Говорящий кот", R.drawable.talkingcat));
        info.add(new Details("Бет Смит", R.drawable.betsmith));
        info.add(new Details("Рик Прайм", R.drawable.rickprime));
        info.add(new Details("Огурчик Рик", R.drawable.ogurchik));
        info.add(new Details("Брэд", R.drawable.brad));
        info.add(new Details("Злой Морти", R.drawable.evilmorty));
        info.add(new Details("MC Хапс", R.drawable.mchaps));
    }


    private void setupdescription() {
        info2.add(new Details("'Pilot' 02.12.2013  S01E01\n" +
                        "'Lawnmower Dog' 9.12.2013 S01E02\n" +
                        "'Anatomy Park' 16.12.2013 S01E03\n" +
                        "'M. Night Shaym-Aliens!' 13.01.2014 S01E04\n" +
                        "'Meeseeks and Destroy' 20.12.2014 S01E05\n" +
                        "'Rick Potion #9' 27.01.2014 S01E06\n" +
                        "'A Rickle in Time' 26.06.2015  S02E01\n" +
                        "'Mortynight Run' 2.08.2015  S02E02\n" +
                        "'Auto Erotic Assimilation' 9.08.2015  S02E03\n" +
                        "'Total Rickall' 16.08.2015  S02E04\n" +
                        "'The Rickshank Rickdemption' 01.04.2017 S03E01\n" +
                        "'Rickmancing the Stone' 30.07.2017 S03E02\n" +
                        "'Pickle Rick' 06.08.2017 S03E03\n" +
                        "'The ABC's of Beth' 24.09.2017 S03E09\n" +
                        "'Edge of Tomorty: Rick Die Rickpeat' 10.10.2019 S04E01\n" +
                        "'Star Mort Rickturn of the Jerri' 31.05.2020 S04E10\n"+
                        "'Mort Dinner Rick Andre' 20.06.2021 S05E1\n" +
                        "'Mortyplicity' 27.06.2021 S05E2\n" +
                        "'Rickternal Friendshine of the Spotless Mort' 08.08.2021 S05E08\n" +
                        "'Rickmurai Jack' 05.09.2021 S05E10\n" +
                        "'Solaricks' 04.09.2022 S06E01\n" +
                        "'Rick: A Mort Well Lived' 11.09.2022 S06E02\n" +
                        "'Bethic Twinstinct' 18.09.2022 S06E03\n" +
                        "'Night Family' 25.09.2022 S06E04\n" +
                        "'Final DeSmithation' 2.10.2022 S06E05\n" +
                        "'Juricksic Mort' 9.10.2022 S06E06\n" +
                        "'Full Meta Jackrick' 20.11.2022 S06E07\n" +
                        "'Analyze Piss' 27.11.2022 S06E08\n" +
                        "'Rick: A Mort Well Lived' 4.12.2022 S06E09\n" +
                        "'Ricktional Mortpoon's Rickmas Mortcation' 11.12.2022 S06E10\n"
                )
        );
        info2.add(new Details("'Pilot' 02.12.2013  S01E01\n" +
                        "'Rick Potion #9' 27.01.2014 S01E06\n" +
                        "'The Rickshank Rickdemption' 01.04.2017 S03E01\n" +
                        "'The ABC's of Beth' 24.09.2017 S03E09\n" +
                        "'Star Mort Rickturn of the Jerri' 31.05.2020 S04E10\n"+
                        "'Mort Dinner Rick Andre' 20.06.2021 S05E1\n" +
                        "'Mortyplicity' 27.06.2021 S05E2\n" +
                        "'Rickternal Friendshine of the Spotless Mort' 08.08.2021 S05E08\n" +
                        "'Rickmurai Jack' 05.09.2021 S05E10\n" +
                        "'Solaricks' 05.09.2021 S6E1\n" +
                        "'Ricktional Mortpoon's Rickmas Mortcation' 11.12.2022 S06E10\n"
                    )
                );

        info2.add(new Details("'Pilot' 02.12.2013  S01E01\n" +
                        "'Rick Potion #9' 27.01.2014 S01E06\n" +
                        "'The Rickshank Rickdemption' 01.04.2017 S03E01\n" +
                        "'The ABC's of Beth' 24.09.2017 S03E09\n" +
                        "'Rick Potion #9' 27.01.2014 S01E06\n" +
                        "'A Rickle in Time' 26.06.2015  S02E01\n" +
                        "'Mortynight Run' 2.08.2015  S02E02\n" +
                        "'Star Mort Rickturn of the Jerri' 31.05.2020 S04E10\n"+
                        "'Mort Dinner Rick Andre' 20.06.2021 S05E1\n" +
                        "'Mortyplicity' 27.06.2021 S05E2\n" +
                        "'Rickternal Friendshine of the Spotless Mort' 08.08.2021 S05E08\n" +
                        "'Rickmurai Jack' 05.09.2021 S05E10\n" +
                        "'Ricktional Mortpoon's Rickmas Mortcation' 11.12.2022 S06E10\n"
                )
        );

        info2.add(new Details("'Pilot' 02.12.2013  S01E01\n" +
                        "'Rick Potion #9' 27.01.2014 S01E06\n" +
                        "'The Rickshank Rickdemption' 01.04.2017 S03E01\n" +
                        "'The ABC's of Beth' 24.09.2017 S03E09\n" +
                        "'Rickternal Friendshine of the Spotless Mort' 08.08.2021 S05E08\n" +
                        "'Rickmurai Jack' 05.09.2021 S05E10\n" +
                        "'Ricktional Mortpoon's Rickmas Mortcation' 11.12.2022 S06E10\n"
                )
        );

        info2.add(new Details("'Pilot' 02.12.2013  S01E01\n" +
                        "'Rick Potion #9' 27.01.2014 S01E06\n" +
                        "'The Rickshank Rickdemption' 01.04.2017 S03E01\n" +
                        "'Rickmancing the Stone' 30.07.2017 S03E02\n" +
                        "'Pickle Rick' 06.08.2017 S03E03\n" +
                        "'The ABC's of Beth' 24.09.2017 S03E09\n" +
                        "'Edge of Tomorty: Rick Die Rickpeat' 10.10.2019 S04E01\n" +
                        "'Star Mort Rickturn of the Jerri' 31.05.2020 S04E10\n"+
                        "'Mort Dinner Rick Andre' 20.06.2021 S05E1\n" +
                        "'Ricktional Mortpoon's Rickmas Mortcation' 11.12.2022 S06E10\n"
                )
        );

        info2.add(new Details("'Pilot' 02.12.2013  S01E01\n" +
                        "'Rick Potion #9' 27.01.2014 S01E06\n" +
                        "'The Rickshank Rickdemption' 01.04.2017 S03E01\n"
                )
        );

        info2.add(new Details("'Pilot' 02.12.2013  S01E01\n" +
                        "'Lawnmower Dog' 9.12.2013 S01E02\n" +
                        "'Anatomy Park' 16.12.2013 S01E03\n" +
                        "'M. Night Shaym-Aliens!' 13.01.2014 S01E04\n" +
                        "'Meeseeks and Destroy' 20.12.2014 S01E05\n" +
                        "'Rick Potion #9' 27.01.2014 S01E06\n" +
                        "'A Rickle in Time' 26.06.2015  S02E01\n" +
                        "'Mortynight Run' 2.08.2015  S02E02\n" +
                        "'Auto Erotic Assimilation' 9.08.2015  S02E03\n" +
                        "'Total Rickall' 16.08.2015  S02E04\n" +
                        "'The Rickshank Rickdemption' 01.04.2017 S03E01\n" +                         "'Mortyplicity' 27.06.2021 S05E2\n" +
                        "'Rickternal Friendshine of the Spotless Mort' 08.08.2021 S05E08\n" +
                        "'Rickmurai Jack' 05.09.2021 S05E10\n" +
                        "'Solaricks' 04.09.2022 S06E01\n" +
                        "'Rick: A Mort Well Lived' 11.09.2022 S06E02\n"
                )
        );

        info2.add(new Details("'Pilot' 02.12.2013  S01E01\n" +
                        "'Lawnmower Dog' 9.12.2013 S01E02\n" +
                        "'Anatomy Park' 16.12.2013 S01E03\n" +
                        "'M. Night Shaym-Aliens!' 13.01.2014 S01E04\n" +
                        "'Meeseeks and Destroy' 20.12.2014 S01E05\n" +
                        "'Rick Potion #9' 27.01.2014 S01E06\n" +
                        "'A Rickle in Time' 26.06.2015  S02E01\n" +
                        "'Mortynight Run' 2.08.2015  S02E02\n" +
                        "'Auto Erotic Assimilation' 9.08.2015  S02E03\n" +
                        "'Total Rickall' 16.08.2015  S02E04\n" +
                        "'The Rickshank Rickdemption' 01.04.2017 S03E01\n" +
                        "'Rickmancing the Stone' 30.07.2017 S03E02\n"
                )
        );

        info2.add(new Details("'Pilot' 02.12.2013  S01E01\n" +
                        "'Lawnmower Dog' 9.12.2013 S01E02\n" +
                        "'Anatomy Park' 16.12.2013 S01E03\n" +
                        "'M. Night Shaym-Aliens!' 13.01.2014 S01E04\n" +
                        "'Pickle Rick' 06.08.2017 S03E03\n" +
                        "'The ABC's of Beth' 24.09.2017 S03E09\n" +
                        "'Edge of Tomorty: Rick Die Rickpeat' 10.10.2019 S04E01\n" +
                        "'Star Mort Rickturn of the Jerri' 31.05.2020 S04E10\n"+
                        "'Mort Dinner Rick Andre' 20.06.2021 S05E1\n" +
                        "'Mortyplicity' 27.06.2021 S05E2\n" +
                        "'Rickternal Friendshine of the Spotless Mort' 08.08.2021 S05E08\n" +
                        "'Rickmurai Jack' 05.09.2021 S05E10\n" +
                        "'Solaricks' 04.09.2022 S06E01\n" +
                        "'Rick: A Mort Well Lived' 11.09.2022 S06E02\n"
                )
        );

        info2.add(new Details("'Pilot' 02.12.2013  S01E01\n" +
                        "'Lawnmower Dog' 9.12.2013 S01E02\n" +
                        "'Anatomy Park' 16.12.2013 S01E03\n" +
                        "'M. Night Shaym-Aliens!' 13.01.2014 S01E04\n" +
                        "'Meeseeks and Destroy' 20.12.2014 S01E05\n" +
                        "'Rick Potion #9' 27.01.2014 S01E06\n" +
                        "'A Rickle in Time' 26.06.2015  S02E01\n" +
                        "'Mortynight Run' 2.08.2015  S02E02\n" +
                        "'Auto Erotic Assimilation' 9.08.2015  S02E03\n" +
                        "'Total Rickall' 16.08.2015  S02E04\n" +
                        "'The Rickshank Rickdemption' 01.04.2017 S03E01\n" +
                        "'Rickmancing the Stone' 30.07.2017 S03E02\n" +
                        "'Pickle Rick' 06.08.2017 S03E03\n" +
                        "'The ABC's of Beth' 24.09.2017 S03E09\n"
                )
        );


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setTitle("Рик и Морти");


        setupinfo();
        setupdescription();

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.addItemDecoration(new SpacesItemDecoration(50));
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        recyclerView.setHasFixedSize(true);


        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration
                (this, DividerItemDecoration.VERTICAL);
        recyclerView.addItemDecoration(dividerItemDecoration);


        MyListData[] listData = new MyListData[]{
                new MyListData("Рик Санчез", R.drawable.ricksanchez),
                new MyListData("Диана Санчез", R.drawable.dianasanchez),
                new MyListData("Морти Смит", R.drawable.mortismith),
                new MyListData("Говорящий кот", R.drawable.talkingcat),
                new MyListData("Бет Смит", R.drawable.betsmith),
                new MyListData("Рик Прайм", R.drawable.rickprime),
                new MyListData("Огурчик Рик", R.drawable.ogurchik),
                new MyListData("Брэд", R.drawable.brad),
                new MyListData("Злой Морти", R.drawable.evilmorty),
                new MyListData("MC Хапс", R.drawable.mchaps),
        };


        MyAdapter adapter = new MyAdapter(MainActivity.this, listData, this);
        recyclerView.setAdapter(adapter);
    }


    @Override
    public void onItemClick(int position) {
        Intent intent = new Intent(this, MainActivity2.class);

        intent.putExtra("NAME", info.get(position).getName());
        intent.putExtra("IMAGE", info.get(position).getImage());
        intent.putExtra("DESCRIPTION", info2.get(position).getDescription());


        startActivity(intent);
    }


}