package com.annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {
    public static void main (String[]args){

        //Create object factory
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext1.xml");

        //Get the beans
        Coach theCoach=context.getBean("myTennisCoach",Coach.class);

        //Call the method using beans
        System.out.println(theCoach.getDailyWorkout());
        System.out.println(theCoach.getDailyFortune());
        //System.out.println(theCoach.getFortune());

        //close the context

        context.close();

    }
}
