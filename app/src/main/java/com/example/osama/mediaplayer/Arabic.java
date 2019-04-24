package com.example.osama.mediaplayer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Arabic extends AppCompatActivity {

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

        SongAdapter adapter = new SongAdapter(this, songs);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}
