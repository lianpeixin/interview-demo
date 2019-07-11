package com.interview.demo.proxy.dynamic;

public class RealSubject implements Subject {

    private String name = "Tom";

    public void visit() {
        System.out.println("hello, " + name);
    }
}
