package com.geeknight.GeekNightApp.repositories;

import com.geeknight.GeekNightApp.repositories.entities.Playlist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PlaylistRepo extends JpaRepository<Playlist, Integer> {

    Playlist getPlaylistByTitle(String title);

}
