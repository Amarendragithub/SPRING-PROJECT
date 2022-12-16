package com.spring.mavenmca.com.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemo {
    public static void main(String []args){
        //create the spring object factory
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        //Get the bean
        Coach theCoach = context.getBean("myCoach",Coach.class);
        Coach alphaCoach = context.getBean("myCoach",Coach.class);

        //compare the beans
        boolean result=(theCoach==alphaCoach);
        System.out.println("Both beans are same:"+result);
        System.out.println("Memory location of theCoach:"+theCoach);
        System.out.println("Memory location of alphaCoach:"+alphaCoach);

        //call the method using beans

        //close the context
    }
}
