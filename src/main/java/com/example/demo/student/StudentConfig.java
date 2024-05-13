package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner comamandLineRunner(StudentRepository repository){
        return args -> {
            Student oskar = new Student(
                    "Oskar",
                    "owilda@gmail.com",
                    LocalDate.of(2002, Month.MAY, 11));

            Student pawel = new Student(
                    "Pawel",
                    "Pawel@gmail.com",
                    LocalDate.of(2002, Month.APRIL, 24));

            repository.saveAll(List.of(oskar, pawel));
        };

    }
}
