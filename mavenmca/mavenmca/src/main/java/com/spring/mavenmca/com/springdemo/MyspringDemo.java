package com.spring.mavenmca.com.springdemo;


import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyspringDemo {
    public static void main(String[]args){
        //create the application context
        ClassPathXmlApplicationContext Context =new ClassPathXmlApplicationContext("applicationContext.xml");

        //Get the bean
        CricketCoach theCoach = Context.getBean("myCricketCoach",CricketCoach.class);
        //call the method
        System.out.println(theCoach.getDailyWorkout());
        System.out.println(theCoach.getDailyFortune());
        System.out.println(theCoach.getEmailAddress());
        System.out.println(theCoach.getTeamName());
        //close the context
        Context.close();
    }
}

