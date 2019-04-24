package com.example.osama.mediaplayer;

public class Song {

    /**
     * Default translation for the word
     */
    private String mSongName;

    /**
     * Miwok translation for the word
     */
    private String mArtistName;

    /**
     * Miwok translation for the word
     */
    private String mGenres;

    /**
     * Miwok translation for the word
     */
    private String mAlbums;

    /**
     * Image resource ID for the word
     */
    private int mImageResourceId;


    /**
     * Create a new Word object.
     *
     * @param songName        is the word in a language that the user is already familiar with
     *                        (such as English)
     * @param artistName      is the word in the Miwok language
     * @param imageResourceId is the resource ID for the audio file associated with this word
     */
    public Song(String songName, String artistName, String albums, String genres, int imageResourceId) {
        mSongName = songName;
        mArtistName = artistName;
        mAlbums = albums;
        mGenres = genres;
        mImageResourceId = imageResourceId;

    }

    /**
     * Get the default translation of the word.
     */
    public String getmSongName() {
        return mSongName;
    }

    /**
     * Get the Miwok translation of the word.
     */
    public String getmArtistName() {
        return mArtistName;
    }

    public String getmAlbumsName() {
        return mAlbums;
    }

    public String getmGenresName() {
        return mGenres;
    }


    /**
     * Return the image resource ID of the song.
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }
}

