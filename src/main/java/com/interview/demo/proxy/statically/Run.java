package com.interview.demo.proxy.statically;

public class Run {

    public static void main(String[] args) {
        ProxySubject proxySubject = new ProxySubject(new RealSubject());
        proxySubject.visit();
    }
}
