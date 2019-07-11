package com.nsfocus.music;

import org.springframework.stereotype.Component;

@Component
public class SgtPeppers implements CompactDisc {
    private String title = "sgt. Pepper's lonely heart's club band";
    private String artist = "the beatles";

    public void play() {
        System.out.println("Playing " + title + " by " + artist);
    }
}
