package com.example.osama.mediaplayer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class English extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        final ArrayList<Song> songs = new ArrayList<Song>();
        songs.add(new Song("in da club", "50 cent", "get rich or day trying ", "Rap", R.drawable.cent));
        songs.add(new Song("smooth criminal", "michel jakson", "bad ", "pop", R.drawable.mickeljackson));
        songs.add(new Song("without me", "eminem", "eminem show ", "Rap", R.drawable.eminem));
        songs.add(new Song("work", "rihanna", "anti ", "pop", R.drawable.rihanna));
        songs.add(new Song("wrecking ball", "maily", "bangerz ", "pop", R.drawable.miley));
        songs.add(new Song("halo", "beyonce", "i am ... sasha fierce ", "pop", R.drawable.beyoncy));
        songs.add(new Song("hang up", "madona", "confessions on a dance floor ", "pop", R.drawable.madona));
        songs.add(new Song("sway", "frank sintra", "sway ", "Romance", R.drawable.frank_sinatra));
        songs.add(new Song("laddy", "kenny rogers", "laddy ", "Romance", R.drawable.kenny_rogers));
        songs.add(new Song("perhabs", "doris day", "perhabs ", "Romance", R.drawable.doris_day));

        SongAdapter adapter = new SongAdapter(this, songs);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}
