package com.nsfocus.music;

import org.springframework.beans.factory.annotation.Value;

public class BlankDisc {
    private String title;
    private String artist;

//    public BlankDisc(@Value("${disc.title}") String title,
//                     @Value("${disc.artist}") String artist) {
//        this.title = title;
//        this.artist = artist;
//    }

    public BlankDisc(@Value("#{systemProperties['dist.title']}") String title,
                     @Value("#{systemProperties['dist.artist']}") String artist) {
        this.title = title;
        this.artist = artist;
    }

    public BlankDisc() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }
}
