package com.taras.Entity;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.scan(Main.class.getPackage().getName());
        ctx.refresh();

        /*Automatically create an instance of class A*/
        /*Thanks to annotation Spring know what object's need to create */
        SomeTool st = ctx.getBean(SomeTool.class);

        System.out.println(st);
    }
}
