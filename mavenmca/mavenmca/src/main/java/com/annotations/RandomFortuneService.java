package com.annotations;

import org.springframework.stereotype.Component;

@Component

public class RandomFortuneService implements FortuneService {

    @Override
    public String getFortune() {
        return "Have a random fortune";
    }
}
