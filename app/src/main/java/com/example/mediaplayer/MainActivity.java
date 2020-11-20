package com.example.mediaplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<String> musics;
    private ListView listView;
    private ImageButton playButton;
    private ImageButton stopButton;
    private ImageButton nextMusicButton;

    private ArrayList<Integer> musicsINT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //elements are reached
        playButton = findViewById(R.id.musicPlayButton);
        stopButton = findViewById(R.id.musicStopButton);
        nextMusicButton = findViewById(R.id.musicNextButton);


        final MediaPlayer musicPlayer;

        //musics = new ArrayList<>();
        musicsINT = new ArrayList<>();
        musicsINT.add(0, R.raw.Pentagram_Bir);
        musicsINT.add("Mor ve Ötesi - Bir Derdim Var");
        musicsINT.add("Badem - Sen Aglama");

        ArrayAdapter<String> listAdapter = new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_list_item_1, musics);
        listView = findViewById(R.id.listView);
        listView.setAdapter(listAdapter);
    }
}