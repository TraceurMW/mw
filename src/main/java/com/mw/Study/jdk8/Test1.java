package com.mw.Study.jdk8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Test1 {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);
//        list.forEach(new Consumer<Integer>() {
//            @Override
//            public void accept(Integer integer) {
//                System.out.println(integer);
//            }
//        });
//        list.forEach(i->{
//            System.out.println(i);
//        });
//        list.forEach((Integer i)->{
//            System.out.println(i);
//        });
        //方法引用 method reference 创建 functionInterface实例
        list.forEach(System.out::println);
    }
}
