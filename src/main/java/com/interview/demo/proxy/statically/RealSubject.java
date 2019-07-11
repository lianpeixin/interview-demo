package com.interview.demo.proxy.statically;

public class RealSubject implements Subject {

    private String name = "Tom";

    public void visit() {
        System.out.println("hello, " + name);
    }
}
