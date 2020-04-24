package com.infogen.samples;

import com.infogen.samples.samples.kotlin.oops.SimpleClass;

public class CallKotlinFromJava {

    public static void main(String[] args) {
        final SimpleClass simpleClass = new SimpleClass(5);
        System.out.println("simpleClass = " + simpleClass.getParam1());

        simpleClass.setParam1(7);
        System.out.println("simpleClass = " + simpleClass.getParam1());
    }
}
