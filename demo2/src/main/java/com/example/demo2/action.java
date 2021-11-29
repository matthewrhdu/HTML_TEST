package com.example.demo2;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class action implements CommandLineRunner {

    private final ArrayList<thing> data;

    public action (){
        data = new ArrayList<>();
    }

    @Override
    public void run(String... args) throws Exception {
        data.add(new thing());
    }
}
