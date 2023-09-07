package org.example.beanlifecycle;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainAnnotation {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("annotationbasedconfiguration/beans.xml");
        applicationContext.close();
    }
}
