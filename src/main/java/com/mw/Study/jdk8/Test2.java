package com.mw.Study.jdk8;
@FunctionalInterface
 interface MyInterface1{
    void test();
    String toString();
}
public class Test2 {
    public void myTest(MyInterface1 myInterface){
        System.out.println(1);
        myInterface.test();
        System.out.println(2);
    }
    public static void main(String[] args) {
        Test2 test2 = new Test2();
        test2.myTest(new MyInterface1() {
            @Override
            public void test() {
                System.out.println("mytest");
            }
        });
        test2.myTest(()->{
            System.out.println("mytest");
        });
        MyInterface1 myInterface=()->{
            System.out.println("tfads");
        };
        System.out.println(myInterface.getClass());
        System.out.println(myInterface.getClass().getSuperclass());
        System.out.println(myInterface.getClass().getInterfaces()[0]);
    }
}
