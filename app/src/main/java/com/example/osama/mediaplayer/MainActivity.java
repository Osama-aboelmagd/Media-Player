package com.example.osama.mediaplayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ImageView AllSong = (ImageView) findViewById(R.id.AllSong);


        AllSong.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                Intent AllSongIntent = new Intent(MainActivity.this, AllSong.class);

                startActivity(AllSongIntent);
            }
        });

        ImageView english = (ImageView) findViewById(R.id.english);

        english.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the family category is clicked on.
            @Override
            public void onClick(View view) {
                Intent englishIntent = new Intent(MainActivity.this, English.class);

                startActivity(englishIntent);
            }
        });

        ImageView arabic = (ImageView) findViewById(R.id.arabic);

        arabic.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the colors category is clicked on.
            @Override
            public void onClick(View view) {
                Intent arabicIntent = new Intent(MainActivity.this, Arabic.class);

                startActivity(arabicIntent);
            }
        });

        ImageView classic = (ImageView) findViewById(R.id.classic);

        classic.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the phrases category is clicked on.
            @Override
            public void onClick(View view) {
                Intent classicIntent = new Intent(MainActivity.this, Classic.class);

                startActivity(classicIntent);
            }
        });
        Button search = (Button) findViewById(R.id.search_button_view);


        search.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the phrases category is clicked on.
            @Override
            public void onClick(View view) {
                Intent searchIntent = new Intent(MainActivity.this, Search.class);
                EditText search_target = (EditText) findViewById(R.id.edit_text_view);
                String search_part = search_target.getText().toString();
                searchIntent.putExtra("keyName", search_part);
                startActivity(searchIntent);

            }
        });
    }
}
