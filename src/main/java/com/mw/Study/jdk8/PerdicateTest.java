package com.mw.Study.jdk8;

import java.awt.*;
import java.util.function.Predicate;

public class PerdicateTest {
    public static void main(String[] args) {
        Predicate<String> predicate = p -> p.length() > 5;
        boolean dafafddfas = predicate.test("dafafddfas");
        System.out.println(dafafddfas);

    }
}
