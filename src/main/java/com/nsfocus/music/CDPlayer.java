package com.nsfocus.music;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CDPlayer {
    private CompactDisc cd;

    @Autowired
    public CDPlayer(CompactDisc cd){
        this.cd = cd;
    }

    public void play(){
        cd.play();
    }

//    @Autowired
//    public void setCompactDisc(CompactDisc cd){
//        this.cd = cd;
//    }
}
