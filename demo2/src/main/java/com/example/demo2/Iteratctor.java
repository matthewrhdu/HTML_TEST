package com.example.demo2;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.io.FileNotFoundException;
import java.util.List;

/**
 * This is a use case class that controls what users are permitted to do with the Student entity.
 * It is closely linked to the repository. We have to register this class with Spring Boot so it can be injected into the controller
 * - so we can tag it with @Configuration.
 */
@Configuration
class Interactor {
    private final Datas repository;

    /**
     * Defines a repository for this use case. The repository will be "injected" by Spring Boot when this class is
     * instantiated as the web server starts up.
     */
    public Interactor(Datas repository) {
        this.repository = repository;
    }

    /**
     * Returns all Students in the database.
     */
    public List<thing> getAllStudents(){
        return repository.findAll();

    }

    /**
     * Creates a student and saves it to the database.
     */
    public thing createStudent(String something){
        thing student = new thing();
        return repository.save(student);
    }


    public thing getStudentById(long id) throws FileNotFoundException {
        return repository.findById(id).orElseThrow(FileNotFoundException::new);
    }
}
