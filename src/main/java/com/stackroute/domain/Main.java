package com.stackroute.domain;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
  public static void main(String[] args) {
    ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);
    Movie movie1 = (Movie) context.getBean("moviebean",Movie.class);
    Movie movie2 = (Movie) context.getBean("moviebean",Movie.class);
    System.out.println(movie1==movie2);
    Actor actor=(Actor)context.getBean("actor");
    Actor actor2=(Actor)context.getBean("actor2");
    Actor actor3=(Actor)context.getBean("actor3");
    System.out.println(actor);
    System.out.println(actor2);
    System.out.println(actor3);
  }
}
