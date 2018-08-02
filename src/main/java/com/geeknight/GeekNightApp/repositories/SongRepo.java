package com.geeknight.GeekNightApp.repositories;

import com.geeknight.GeekNightApp.repositories.entities.Song;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SongRepo extends JpaRepository<Song, Integer> {

}

