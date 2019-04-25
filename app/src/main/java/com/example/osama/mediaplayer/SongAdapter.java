package com.example.osama.mediaplayer;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;


public class SongAdapter extends ArrayAdapter<Song> {

    public SongAdapter(Context context, ArrayList<Song> songs) {
        super(context, 0, songs);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Song currentSong = getItem(position);

        TextView songNameTextView = (TextView) listItemView.findViewById(R.id.song_name_text_view);
        songNameTextView.setText(currentSong.getmSongName());

        TextView artistNameTextView = (TextView) listItemView.findViewById(R.id.artist_name_text_view);
        artistNameTextView.setText(currentSong.getmArtistName());

        TextView albumNameTextView = (TextView) listItemView.findViewById(R.id.albums_name_text_view);
        albumNameTextView.setText(currentSong.getmAlbumsName());

        TextView genresNameTextView = (TextView) listItemView.findViewById(R.id.genres_name_text_view);
        genresNameTextView.setText(currentSong.getmGenresName());

        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);
        imageView.setImageResource(currentSong.getImageResourceId());

        return listItemView;
    }
}