package com.chen.observable;


import java.util.Observable;

/**
 * @description:被观察者
 * @author: Chen
 * @create: 2019-04-03 23:01
 **/
public class PayObservable extends Observable {



    @Override
    public void notifyObservers() {
        System.out.println("有人下单啦");
        setChanged();
        super.notifyObservers();
    }
}
