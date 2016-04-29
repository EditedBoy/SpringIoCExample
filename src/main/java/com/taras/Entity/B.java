package com.taras.Entity;

import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Component
public class B {

    @Override
    public String toString() {
        Logger log = Logger.getLogger(A.class.getName());
        log.info("Spring create instance of class when it needed");
        log.info("We can see it in console");

        return "I'm working! This is class B";
    }
}
