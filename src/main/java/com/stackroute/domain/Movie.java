package com.stackroute.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("moviebean")
@Scope("prototype")
public class Movie {

@Autowired
  private Actor actor;

  @Override
  public String toString() {
    return "Movie{" +
      "actor=" + actor;
  }


}
