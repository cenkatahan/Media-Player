package com.example.mediaplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ListView listView;
    private ImageButton playButton;
    private ImageButton stopButton;
    private ImageButton nextMusicButton;

    private ArrayList<String> musics;
    private int songIndex;
    private MediaPlayer musicPlayer  = null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //elements are reached
        playButton = findViewById(R.id.musicPlayButton);
        stopButton = findViewById(R.id.musicStopButton);
        nextMusicButton = findViewById(R.id.musicNextButton);

        //musics
        musics = new ArrayList<>();
        musics.add("Pentagram - Bir");
        musics.add("Duman - Öyle Dertli");
        musics.add("Badem - Sen Ağlama");
        //setting an adapter
        ArrayAdapter<String> listAdapter = new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_list_item_1, musics);
        listView = findViewById(R.id.musicsListView);
        listView.setAdapter(listAdapter);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String song = listView.getItemAtPosition(position).toString();
                songIndex = position;
                Toast.makeText(MainActivity.this, " "+song, Toast.LENGTH_SHORT).show();
            }
        });

        playButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (songIndex){
                    case 0:
                        musicPlayer = MediaPlayer.create(MainActivity.this, R.raw.pentagram_bir);
                        musicPlayer.start();
                        break;
                    case 1:
                        musicPlayer = MediaPlayer.create(MainActivity.this, R.raw.duman_oyledertli);
                        musicPlayer.start();
                        break;
                    case 2:
                        musicPlayer = MediaPlayer.create(MainActivity.this, R.raw.badem_senaglama);
                        musicPlayer.start();
                        break;
                }
            }
        });

        stopButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                musicPlayer.pause();
            }
        });




    }
    

}


