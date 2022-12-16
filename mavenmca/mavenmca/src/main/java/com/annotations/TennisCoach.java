package com.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("myTennisCoach")
@Scope("prototype")

public class TennisCoach implements Coach {
    @Autowired
    @Qualifier("randomFortuneService")
    private FortuneService fortuneService;
    /*@Autowired
    public TennisCoach(FortuneService  fortuneService){
        this.fortuneService=fortuneService;
    }
*/

    public FortuneService getFortuneService() {
        return fortuneService;
    }
//    @Autowired
//    public void setFortuneService(FortuneService fortuneService) {
//        this.fortuneService = fortuneService;
//    }

    @Override
    public String getDailyWorkout(){
        return "Practice Tennis for 2hours";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}