package com.example.osama.mediaplayer;

public class Song {

    private String mSongName;

    private String mArtistName;

    private String mGenres;

    private String mAlbums;

    private int mImageResourceId;


    public Song(String songName, String artistName, String albums, String genres, int imageResourceId) {
        mSongName = songName;
        mArtistName = artistName;
        mAlbums = albums;
        mGenres = genres;
        mImageResourceId = imageResourceId;

    }

    public String getmSongName() {
        return mSongName;
    }

    public String getmArtistName() {
        return mArtistName;
    }

    public String getmAlbumsName() {
        return mAlbums;
    }

    public String getmGenresName() {
        return mGenres;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }
}

