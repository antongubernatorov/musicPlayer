package ru.gubern.springalishev;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
@Data
public class MusicPlayer {

    @Value("${name}")
    private String name;
    @Value("${volume}")
    private Integer volume;

    private final ClassicalMusic classicalMusic;
    private final ModernMusic modernMusic;

    @Autowired
    public MusicPlayer(ClassicalMusic classicalMusic, ModernMusic modernMusic) {
        this.classicalMusic = classicalMusic;
        this.modernMusic = modernMusic;
    }

    public void playMusic(Genres genres){
        Random random = new Random();
        int randomNumber = random.nextInt(3);
        if (genres == Genres.ROCK){
            System.out.println(modernMusic.playMusic().get(randomNumber));
        } else {
            System.out.println(classicalMusic.playMusic().get(randomNumber));
        }
    }
}
