package com.springmca.demo.Controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Field;
import java.util.Arrays;

@Controller
public class MyWebPage {
    private FoodService foodService;

    public MyWebPage(FoodService foodService) {
        this.foodService = foodService;
    }

    @RequestMapping("/home")
    public String myWebPage(){
        return "home";
    }
    @GetMapping("/model")
    public String getModel (Model model){
        model.addAttribute("message","This is coming from the Controller");
        model.addAttribute("people", Arrays.asList(
                new Person("A",20),
                new Person("B",23),
                new Person("A",22),
                new Person("B",18)

        ));
        return "modelpage";
    }
    @GetMapping("/")
    public String getQueryMapping(@RequestParam(value="name",defaultValue="World",required=true)
    String name,Model model){
        model.addAttribute("name",name);
        return "requestpage";
    }

    @GetMapping("/greeting")
    public String greetingForm(Model model){
        model.addAttribute("greeting",new Greeting());
        return "greeting";
    }
    @PostMapping("/greeting")
    public String greetingSubmit(@ModelAttribute Greeting greeting,Model model){
        model.addAttribute("greeting",greeting);
        return "result";
    }
    @GetMapping("/food")
    public String getFood(Model model,Food food){
        Food[]foods= foodService.getFoods();
        model.addAttribute("foods",foods);
        return "food";
    }
    @PostMapping("/food")
    public  String addFood(Model model,Food food) {
//        int result = foodService.addFood(food);
        if (food.getPrice() > 1000) {

            model.addAttribute("errormessage", String.format("Coulc not add %s Too Expensive!!", food.getName()));
        } else if (foodService.addFood(food) < 1){
            model.addAttribute("errormessage", String.format("Coulc not add %s", food.getName()));
        }else {
            model.addAttribute("successfulmessage", String.format("successfully added %s", food.getName()));
        }
        Food[] foods=foodService.getFoods();
        model.addAttribute("foods",foods);
        return "food";

    }

}



