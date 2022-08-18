package it2.develhope.firstAPI01.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NameController {

    @GetMapping("/")
    public String getName(){
        return "Angelo Zammataro";
    }

    @PostMapping("/{name}")
    public StringBuilder reverseName(@PathVariable String name){
        StringBuilder str = new StringBuilder(name);
        return str.reverse();
    }
}
