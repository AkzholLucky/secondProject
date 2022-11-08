package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        PlayMusic playMusic = context.getBean("playMusic", PlayMusic.class);
        playMusic.play();
        context.close();
    }
}
