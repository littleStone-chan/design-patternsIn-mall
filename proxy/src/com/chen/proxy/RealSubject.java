package com.chen.proxy;

/**
 * @author chen
 * @create 2019-04-24 17:30
 **/
public class RealSubject implements Subject{

    @Override
    public boolean sellBook() {
        System.out.println("卖书呢。");
        return false;
    }

}
