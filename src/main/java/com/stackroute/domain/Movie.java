package com.stackroute.domain;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("moviebean")
@Scope("prototype")
public class Movie implements ApplicationContextAware, BeanNameAware, BeanFactoryAware {

@Autowired
  private Actor actor;

  @Override
  public String toString() {
    return "Movie{" +
      "actor=" + actor;
  }


  @Override
  public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
    System.out.println(beanFactory);
  }

  @Override
  public void setBeanName(String s) {
    System.out.println(s);

  }

  @Override
  public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
      System.out.println(applicationContext);
  }
}
