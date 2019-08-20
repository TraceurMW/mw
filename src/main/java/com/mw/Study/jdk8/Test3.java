package com.mw.Study.jdk8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Test3 {
    public static void main(String[] args) {

        Function<String,String> function=String::toUpperCase;
        System.out.println(function.getClass().getInterfaces()[0]);

        List<String> list = Arrays.asList("dfa", "asdf", "afs");

//        list.forEach(item -> System.out.println(item.toUpperCase()));
        List<String> list2 = new ArrayList<>();
        list.forEach(item -> list2.add(item.toUpperCase()));
//        list2.forEach(item-> System.out.println(item));
//        list.stream().map(item->item.toUpperCase()).forEach(item-> System.out.println(item));
//        list.stream().map(String::toUpperCase).forEach(item-> System.out.println(item));
//        TheInterface i1=()->{};
//        System.out.println(i1.getClass().getInterfaces()[0]);
//
//        TheInterface1 i2=()->{};
//        System.out.println(i2.getClass().getInterfaces()[0]);
//
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//
//            }
//        });
//        new Thread(()->{
//            System.out.println("");
//        }).start();
    }
}

interface TheInterface {
    void myMethod();
}

interface TheInterface1 {
    void myMethod();
}