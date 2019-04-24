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


/**
 * {@link SongAdapter} is an {@link ArrayAdapter} that can provide the layout for each list item
 * based on a data source, which is a list of {@link Song} objects.
 */
public class SongAdapter extends ArrayAdapter<Song> {



    /**
     * Create a new {@link SongAdapter} object.
     *
     * @param context is the current context (i.e. Activity) that the adapter is being created in.
     * @param words is the list of {@link Song}s to be displayed.
     */
    public SongAdapter(Context context, ArrayList<Song> words) {
        super(context, 0, words);

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link Word} object located at this position in the list
        Song currentSong = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID miwok_text_view.
        TextView songNameTextView = (TextView) listItemView.findViewById(R.id.song_name_text_view);
        // Get the Miwok translation from the currentWord object and set this text on
        // the Miwok TextView.
        songNameTextView.setText(currentSong.getmSongName());

        // Find the TextView in the list_item.xml layout with the ID miwok_text_view.
        TextView artistNameTextView = (TextView) listItemView.findViewById(R.id.artist_name_text_view);
        // Get the Miwok translation from the currentWord object and set this text on
        // the Miwok TextView.
        artistNameTextView.setText(currentSong.getmArtistName());

        // Find the TextView in the list_item.xml layout with the ID miwok_text_view.
        TextView albumNameTextView = (TextView) listItemView.findViewById(R.id.albums_name_text_view);
        // Get the Miwok translation from the currentWord object and set this text on
        // the Miwok TextView.
        albumNameTextView.setText(currentSong.getmAlbumsName());

        // Find the TextView in the list_item.xml layout with the ID default_text_view.
        TextView genresNameTextView = (TextView) listItemView.findViewById(R.id.genres_name_text_view);
        // Get the default translation from the currentWord object and set this text on
        // the default TextView.
        genresNameTextView.setText(currentSong.getmGenresName());

        // Find the ImageView in the list_item.xml layout with the ID image.
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);
        // Check if an image is provided for this word or not

            // If an image is available, display the provided image based on the resource ID
            imageView.setImageResource(currentSong.getImageResourceId());
           // Make sure the view is visible



        // Set the theme color for the list item
        View textContainer = listItemView.findViewById(R.id.text_container);
        // Return the whole list item layout (containing 2 TextViews) so that it can be shown in
        // the ListView.
        return listItemView;
    }
}