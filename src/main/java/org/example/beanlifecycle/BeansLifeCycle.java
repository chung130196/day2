package org.example.beanlifecycle;

public class BeansLifeCycle {
    public void init(){
        System.out.printf("Init method is called");
    }
    public void destroy(){
        System.out.printf("destroy method is called");
    }
}
