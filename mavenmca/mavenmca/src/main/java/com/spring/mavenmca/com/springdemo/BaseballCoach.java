package com.spring.mavenmca.com.springdemo;

public class BaseballCoach implements Coach {
    private FortuneService fortuneService;
    public BaseballCoach(FortuneService theFortunerservice){
        this.fortuneService = theFortunerservice;
    }

    @Override
    public String getDailyWorkout() {
        return null;
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}