package com.nsfocus.music;

import org.springframework.stereotype.Component;

/**
 * CD
 */
@Component
public interface CompactDisc {
    void play();
    void playTrack(int number);
}
