package de.telran.coffeeshop;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/coffee")
public class CoffeeController {
    //http://127.0.0.1:8080/coffee - my PC address
    //http://localhost:8080/coffee
    private List<Coffee> coffeeList = new ArrayList<>();

    public CoffeeController() {
        coffeeList.add(new Coffee(1, "Latte"));
        coffeeList.add(new Coffee(2, "Americano"));
        coffeeList.add(new Coffee(3, "Cappuccino"));
        coffeeList.add(new Coffee(4, "Mocha"));
    }
    @GetMapping         //(value = "/get_all")
    public List<Coffee> getAll(){
        return coffeeList;
    }


}
