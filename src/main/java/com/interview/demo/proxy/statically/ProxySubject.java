package com.interview.demo.proxy.statically;

public class ProxySubject implements Subject {

    private Subject subject;

    public ProxySubject(Subject subject) {
        this.subject = subject;
    }

    public void visit() {
        System.out.println("proxy before");
        subject.visit();
        System.out.println("proxy after");
    }
}
