package ru.gubern.springalishev;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
                SpringConfig.class
        );
        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        musicPlayer.playMusic(Genres.CLASSICAL);
        musicPlayer.playMusic(Genres.ROCK);
        System.out.println(musicPlayer.getVolume());
        System.out.println(musicPlayer.getName());
    }
}
