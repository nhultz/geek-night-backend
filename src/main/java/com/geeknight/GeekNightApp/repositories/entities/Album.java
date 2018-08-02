package com.geeknight.GeekNightApp.repositories.entities;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.Duration;

@Entity
@Getter @Setter
public class Album {

    @Id
    private int id;
    private String title;
    private int artistId;
    private Genre genre;
    private Duration duration;
    private boolean isExplicit;
    private boolean isFavorite;

    public Album(){}


}
