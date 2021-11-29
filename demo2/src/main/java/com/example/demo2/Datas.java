package com.example.demo2;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * The implementation of this interface, which is handled by Spring Boot, is a "Gateway" to a database.
 */
@Repository
interface Datas extends JpaRepository<thing, Long> {
//    We could make this a class and do our own work (requires SQL knowledge) to fetch data,
//    but we can let Springboot take care of this for us of now!
}
