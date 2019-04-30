package com.chen.proxy;

import java.lang.reflect.Proxy;

/**
 * @author chen
 * @create 2019-04-24 17:37
 **/
public class Main {

    public static void main(String[] args) {

        Subject subject = new RealSubject();

        MyInvocationHandler invocationHandler = new MyInvocationHandler(subject);

        Subject proxyClass = (Subject) Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(), new Class[]{Subject.class},invocationHandler );
        proxyClass.sellBook();

    }

}
