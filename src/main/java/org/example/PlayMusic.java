package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class PlayMusic {
    Music music;

    @Autowired

    public PlayMusic(@Qualifier("rockMusic") Music music) {
        this.music = music;
    }

    //    private String name;
//    private int volume;
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public int getVolume() {
//        return volume;
//    }
//
//    public void setVolume(int volume) {
//        this.volume = volume;
//    }
//
//    public PlayMusic(Music music) {
//        this.music = music;
//    }
//
//    public PlayMusic(){}
//
//    public void setMusic(Music music) {
//        this.music = music;
//    }
//
    public void play(){
        System.out.println("Playing music: ");
        System.out.println(music.getSong());
    }
}
