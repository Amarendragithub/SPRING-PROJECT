package com.annotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SourceConfigBeanDemoApp {
    public static void main(String[]args){
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(SportConfig.class);

                //Get the beans
                Coach theCoach=context.getBean("swimCoach",Coach.class);

        //Call the method using beans
        System.out.println(theCoach.getDailyWorkout());
        System.out.println(theCoach.getDailyFortune());
        //System.out.println(theCoach.getFortune());

        //close the context

        context.close();
    }
}


