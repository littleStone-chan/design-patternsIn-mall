package com.chen.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author chen
 * @create 2019-04-24 17:31
 **/
public class MyInvocationHandler implements InvocationHandler {

    private Subject realSubject;

    public MyInvocationHandler(Subject realSubject) {
        this.realSubject = realSubject;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        if (method.getName().equals("sellBook")){
            method.invoke(realSubject,args);
            System.out.println("在代理类调用读书");
        }

        return true;
    }
}
