package com.annotations;

public class SwimCoach implements Coach
{
    public SwimCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    private FortuneService fortuneService;

    public String getDailyWorkout(){
        return "Practice Swimming for 300meter";
    }

    public String getDailyFortune(){
        return fortuneService.getFortune();
    }
}
