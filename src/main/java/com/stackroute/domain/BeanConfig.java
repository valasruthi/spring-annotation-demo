package com.stackroute.domain;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan(basePackages = "com.stackroute.domain")
public class BeanConfig {
  @Bean
  public Actor actor() {
    Actor actor = new Actor("sruthi", "female", 22);

    return actor;
  }

  @Bean
  public Actor actor2() {
    Actor actor2 = new Actor("CHINNI", "female", 22);

    return actor2;
  }

  @Bean
  public Actor actor3() {
    Actor actor3 = new Actor("VALA", "female", 22);

    return actor3;

  }

  @Bean
  public BeanPostProcessorDemoBean beanPostProcessorDemoBean() {
    BeanPostProcessorDemoBean beanPostProcessorDemoBean=new BeanPostProcessorDemoBean();
    return beanPostProcessorDemoBean;
  }

}
