package com.nanda.pattern.observer.demo;

import java.util.ArrayList;
import java.util.List;

public class Subject implements ISubject {

  private String message;

  private List<IObserver> observers;

  public Subject() {
    this.message = "empty message";
    this.observers = new ArrayList<IObserver>();
  }


  public void register(IObserver observer) {
    this.observers.add(observer);
  }

  public void remove(IObserver observer) {

    this.observers.remove(this.observers.indexOf(observer));

  }

  public void notification() {
    for(IObserver observer: observers) {
      observer.update(this.message);
    }
  }

  public void setMessage(String message) {
    this.message = message;
  }

}
