package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.time.Month.*;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student pete = new Student(
                    "Pete",
                    "pete.pete@gmail.com",
                    LocalDate.of(2000, JANUARY, 6)
            );

            Student jane = new Student(
                    "Jane",
                    "jane404@gmail.com",
                    LocalDate.of(2002, JANUARY, 6)
            );

            repository.saveAll(
                    List.of(pete, jane)
            );
        };
    }
}
