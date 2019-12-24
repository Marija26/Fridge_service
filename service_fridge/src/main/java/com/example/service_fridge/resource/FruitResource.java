package com.example.service_fridge.resource;

import com.example.service_fridge.model.Fruit;
import com.example.service_fridge.repository.FruitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/rest")
public class FruitResource {

    private FruitRepository fruitRepository;

    @Autowired
    public FruitResource(FruitRepository fruitRepository) {
        this.fruitRepository = fruitRepository;
    }


    @RequestMapping(value = "/add",
            method = RequestMethod.POST,
            produces = {MediaType.APPLICATION_JSON_VALUE})
    @ResponseBody
    public Fruit addFruit(@RequestBody Fruit fruit) {
        return fruitRepository.save(fruit);
    }
}




