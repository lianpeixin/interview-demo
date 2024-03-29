package com.interview.demo.proxy.dynamic;

import java.lang.reflect.Proxy;

public class Run {

    public static void main(String[] args) {
        Subject realSubject = new RealSubject();
        DynamicProxy proxy = new DynamicProxy(realSubject);
        ClassLoader classLoader = realSubject.getClass().getClassLoader();
        Subject subject = (Subject) Proxy.newProxyInstance(classLoader, new Class[]{ Subject.class }, proxy);
        subject.visit();
    }
}
