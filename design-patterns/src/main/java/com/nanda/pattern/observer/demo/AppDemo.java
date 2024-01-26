package com.nanda.pattern.observer.demo;

public class AppDemo {

  public static void main(String[] args) {

    Subject subject = new Subject();

    IObserver observerOne = new ObserverOne();
    IObserver observerTwo = new ObserverTwo();

    subject.register(observerOne);
    subject.register(observerTwo);

    subject.notification();

    subject.setMessage("nanda");

    subject.notification();

  }

}
