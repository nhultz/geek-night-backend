package com.geeknight.GeekNightApp.repositories;


import com.geeknight.GeekNightApp.repositories.entities.Album;
import com.geeknight.GeekNightApp.repositories.entities.Song;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Collection;

public interface AlbumRepository extends JpaRepository <Album, Long> {

    Collection<Album> findByArtistId(Long artistId);


    Collection<Song> getAllSongsFromAlbum(Long albumId);


}
