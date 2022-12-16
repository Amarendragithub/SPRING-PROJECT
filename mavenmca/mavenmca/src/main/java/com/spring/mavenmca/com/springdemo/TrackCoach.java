package com.spring.mavenmca.com.springdemo;

public class TrackCoach implements Coach{
    @Override
    public String getDailyWorkout(){
        return "Run 5km everyday.";
    }
    @Override
    public String getDailyFortune(){
        return null;
    }
}
