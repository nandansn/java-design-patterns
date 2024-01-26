package com.nanda.pattern.observer.demo;

public class ObserverTwo implements IObserver {
  public void update(String message) {
    System.out.println(message + ObserverTwo.class.getName());
  }

}
