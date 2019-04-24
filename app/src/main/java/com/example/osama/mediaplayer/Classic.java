package com.example.osama.mediaplayer;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class Classic extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        final ArrayList<Song> songs = new ArrayList<Song>();
        songs.add(new Song("sert el hob", "om kalsom","sert el hob ","Romance",R.drawable.omkalthom));
        songs.add(new Song("gana el hawa", "abd el halem hafez","gana el hawa ","Romance",R.drawable.hafaz));
        songs.add(new Song("khalas msafer", "shadia","khalas msafer ","Romance",R.drawable.shadia));
        songs.add(new Song("alby wa moftaho", "farid el atrsh","alby wa moftaho ","Romance",R.drawable.fared));
        songs.add(new Song("elshok elshok", "mohamed fawzy","elshok elshok ","Romance",R.drawable.fawzy));
        songs.add(new Song("sway", "frank sintra","sway ","Romance",R.drawable.frank_sinatra));
        songs.add(new Song("laddy", "kenny rogers","laddy ","Romance",R.drawable.kenny_rogers));
        songs.add(new Song("perhabs", "doris day","perhabs ","Romance",R.drawable.doris_day));
        songs.add(new Song("hang up", "madona","confessions on a dance floor ","pop",R.drawable.madona));
        songs.add(new Song("smooth criminal", "michel jakson","bad ","pop",R.drawable.mickeljackson));


        SongAdapter adapter = new SongAdapter(this, songs);


        ListView listView = (ListView) findViewById(R.id.list);


        listView.setAdapter(adapter);
    }
}

