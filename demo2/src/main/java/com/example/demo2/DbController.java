package com.example.demo2;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.io.FileNotFoundException;
import java.util.List;


@RestController
public class DbController {
    public thing something = new thing();

    private final Interactor interactor;

    public DbController(Interactor interactor) {
        this.interactor = interactor;
    }

    @GetMapping("/students")
    List<thing> all() {
        return interactor.getAllStudents();
    }

    @GetMapping("/students/{id}")
    thing one(@PathVariable Long id) throws FileNotFoundException {
        return interactor.getStudentById(id);
    }

    @PostMapping("/students")
    thing newStudent(@RequestBody thing newStudent) {
        return interactor.createStudent(newStudent.getSomething());
    }
}
