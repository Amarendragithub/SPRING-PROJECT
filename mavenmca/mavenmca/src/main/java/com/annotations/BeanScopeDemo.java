package com.annotations;


import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemo {
    public static void main(String []args){
        //create the spring object factory
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext1.xml");

        //Get the bean
        Coach theCoach = context.getBean("myTennisCoach",Coach.class);
        Coach alphaCoach = context.getBean("myTennisCoach",Coach.class);

        //compare the beans
        boolean result=(theCoach==alphaCoach);
        System.out.println("Both beans are same:"+result);
        System.out.println("Memory location of theCoach:"+theCoach);
        System.out.println("Memory location of alphaCoach:"+alphaCoach);

        //call the method using beans

        //close the context
    }
}
