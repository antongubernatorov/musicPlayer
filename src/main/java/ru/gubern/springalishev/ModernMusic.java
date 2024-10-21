package ru.gubern.springalishev;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ModernMusic implements Music{
    private List<String> songs = new ArrayList<>();

    {
        songs.add("Wind cries Mary");
        songs.add("Paint it black");
        songs.add("Can't seem to make you mine");
    }


    @Override
    public List<String> playMusic() {
        return songs;
    }
}
