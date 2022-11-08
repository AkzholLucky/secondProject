package org.example;

import org.springframework.stereotype.Component;

@Component
public class ClassicalMusic implements Music{
    public void doMyInit(){
        System.out.println("Doing init");
    }
    public void doMyDestroy(){
        System.out.println("Doing destroy");
    }
    @Override
    public String getSong() {
        return "hello";
    }
}
