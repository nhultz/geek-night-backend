package com.geeknight.GeekNightApp.api;

import com.geeknight.GeekNightApp.repositories.SongRepo;
import com.geeknight.GeekNightApp.repositories.entities.Song;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import java.util.Collection;
import java.util.Optional;


@RestController
public class SongRestController {
    private SongRepo songRepo;

    @Autowired
    public SongRestController(SongRepo songRepo){this.songRepo = songRepo;}


    public Collection<Song> getAllSongs(){return songRepo.findAll();}


    public Optional<Song> getSongById(@PathVariable int songId){return songRepo.findById(songId);}



}

