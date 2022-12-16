package com.springmca.demo.Controllers;

import org.springframework.stereotype.Service;

@Service
public class FoodService {
    private FoodMapper foodMapper;

    public FoodService(FoodMapper foodMapper) {
        this.foodMapper = foodMapper;
    }

    public Food[] getFoods() {
        Food[]foods= foodMapper.selectFoods();
        return foods;
    }
    public int addFood(Food food){
        return foodMapper.insertFood(food);
    }
}
