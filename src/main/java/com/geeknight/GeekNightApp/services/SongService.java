package com.geeknight.GeekNightApp.services;

import com.geeknight.GeekNightApp.repositories.SongRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SongService {
    private SongRepo songRepo;

    @Autowired
    public SongService(SongRepo songRepo){this.songRepo = songRepo;}
}

