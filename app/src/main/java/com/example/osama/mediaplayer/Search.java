package com.example.osama.mediaplayer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class Search extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        final ArrayList<Song> songs = new ArrayList<Song>();
        songs.add(new Song("tammaly maak", "amr diab", "tamally maak ", "Pop", R.drawable.amrdiab));
        songs.add(new Song("khadny el hanen", "mohamed fouad", "wala nos kelma ", "Pop", R.drawable.fouad));
        songs.add(new Song("fe ashk el banat", "mohamed monir", "fe ashk el banat ", "Pop", R.drawable.monir));
        songs.add(new Song("mabalash", "mohamed hamaky", "omro maygeb ", "Pop", R.drawable.hamaki));
        songs.add(new Song("lolak habiby", "tamer hosny", "lolak habeby ", "Romance", R.drawable.tamer));
        songs.add(new Song("sert el hob", "om kalsom", "sert el hob ", "Romance", R.drawable.omkalthom));
        songs.add(new Song("gana el hawa", "abd el halem hafez", "gana el hawa ", "Romance", R.drawable.hafaz));
        songs.add(new Song("khalas msafer", "shadia", "khalas msafer ", "Romance", R.drawable.shadia));
        songs.add(new Song("alby wa moftaho", "farid el atrsh", "alby wa moftaho ", "Romance", R.drawable.fared));
        songs.add(new Song("elshok elshok", "mohamed fawzy", "elshok elshok ", "Romance", R.drawable.fawzy));
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

        final ArrayList<Song> songs_search = new ArrayList<Song>();
        Bundle extras = getIntent().getExtras();
        String search_target = extras.getString("keyName");

        if (!search_target.matches("")) {
            int count = 0;
            while (songs.size() > count) {
                Song song = songs.get(count);
                if (song.getmSongName().contains(search_target)
                        || song.getmArtistName().contains(search_target)
                        || song.getmAlbumsName().contains(search_target)
                        || song.getmGenresName().contains(search_target)) {
                    songs_search.add(songs.get(count));
                }
                count++;
            }
            SongAdapter adapter = new SongAdapter(this, songs_search);
            ListView listView = (ListView) findViewById(R.id.list);
            listView.setAdapter(adapter);
        }
        if (songs_search.size() <= 0 || search_target.matches("")) {
            setContentView(R.layout.search);
        }
    }
}

