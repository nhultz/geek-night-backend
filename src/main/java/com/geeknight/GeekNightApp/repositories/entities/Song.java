package com.geeknight.GeekNightApp.repositories.entities;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.Duration;

@Entity
@Getter @Setter
public class Song {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;
  private String title;
  private Duration duration;
  private boolean isExplicit;
  private boolean isFavorite;
  private Album album;

}

