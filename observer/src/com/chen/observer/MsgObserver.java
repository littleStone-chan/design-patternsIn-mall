package com.chen.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * @description:消息观察者
 * @author: Chen
 * @create: 2019-04-03 22:50
 **/
public class MsgObserver implements Observer {

    public MsgObserver(Observable observable){
        observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("管理员，有人下单啦。");
    }
}
