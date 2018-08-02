package com.geeknight.GeekNightApp.repositories.entities;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.Entity;
import java.time.Duration;

@Entity
@Getter @Setter
public class Song {

  private int id;
  private String title;
  private Duration duration;
  private boolean isExplicit;
  private boolean isFavorite;

}

