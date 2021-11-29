package com.example.demo2;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class thing {
    private @Id @GeneratedValue Long Id;
    private String something;

    public thing() {
        this.something = "Something";
    }

    public String getSomething() {
        return something;
    }
}
