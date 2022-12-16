package com.annotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SourceConfigDemoApp {
    public static void main(String[]args){
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(SportConfig.class);

                //Get the beans
                Coach theCoach=context.getBean("myTennisCoach",Coach.class);

        //Call the method using beans
        System.out.println(theCoach.getDailyWorkout());
        System.out.println(theCoach.getDailyFortune());


        //close the context

        context.close();
    }
}


