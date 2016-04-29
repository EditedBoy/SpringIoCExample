package com.taras.Entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


@Service
public class SomeTool {

    private A a;
    private B b;

    @Autowired
    public SomeTool(A a, B b){
        this.a = a;
        this.b = b;
    }

    @Override
    public String toString() {
        return a.toString() + "\n" + b.toString();
    }
}
