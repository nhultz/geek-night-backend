package com.geeknight.GeekNightApp.repositories.entities;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import java.time.Duration;

@Entity
@Getter @Setter
public class Album {

    private int id;
    private String title;
    private int artistId;
    private Genre genre;
    private Duration duration;
    private boolean isExplicit;
    private boolean isFavorite;


}
