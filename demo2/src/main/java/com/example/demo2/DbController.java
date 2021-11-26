package com.example.demo2;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class DbController {
    public doThings something = new doThings();

    @PostMapping("/something")
    public String get(){
        return something.run("Hello!");
    }
}
