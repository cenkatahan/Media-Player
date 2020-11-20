package com.example.mediaplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<String> musics;
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        musics = new ArrayList<>();
        musics.add("Pentagram - Bir");
        musics.add("Mor ve Ötesi - Bir Derdim Var");
        musics.add("Badem - Sen Aglama");

        ArrayAdapter<String> listAdapter = new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_list_item_1, musics);
        listView = findViewById(R.id.listView);
        listView.setAdapter(listAdapter);
    }
}