package com.nanda.pattern.observer.demo;

public interface ISubject {

  public void register(IObserver observer);
  public void remove(IObserver observer);
    public void notification();
}
