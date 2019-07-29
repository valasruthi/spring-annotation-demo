package com.stackroute.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("moviebean")
public class Movie {
  @Autowired
  private Actor actor;

  public Movie() {
  }

  public Movie(Actor actor) {
    this.actor = actor;
  }

  public Actor getActor() {
    return actor;
  }

  public void setActor(Actor actor) {
    this.actor = actor;
  }

  @Override
  public String toString() {
    return "Movie{" +
      "actor=" + actor;
  }


}
