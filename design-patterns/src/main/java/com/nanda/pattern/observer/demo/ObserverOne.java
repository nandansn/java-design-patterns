package com.nanda.pattern.observer.demo;

public class ObserverOne implements IObserver {

  public void update(String message) {
    System.out.println("hello:"+message +"[class:"+ ObserverOne.class.getName()+"]");
  }
}
