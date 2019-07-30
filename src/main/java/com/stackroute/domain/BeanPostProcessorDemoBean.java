package com.stackroute.domain;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class BeanPostProcessorDemoBean implements BeanPostProcessor {

  @Override
  public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {

    System.out.println("Before initialisation " + beanName);
    return bean;
  }


  @Override
  public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {

    System.out.println("After initialisation " + beanName);
    return bean;
  }
}
