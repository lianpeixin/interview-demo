package com.interview.demo.proxy.cglib;

import net.sf.cglib.proxy.Enhancer;

public class Run {

    public static void main(String[] args) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(Hello.class);
        enhancer.setCallback(new MyMethodInterceptor());

        Hello hello = (Hello) enhancer.create();
        hello.hello();
    }
}
