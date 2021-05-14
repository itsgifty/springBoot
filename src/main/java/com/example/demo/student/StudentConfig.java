package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.time.Month.APRIL;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository)
    {
        return args -> {
        Student mariam=new Student(1L, "MAry", "mary@gmail.com", LocalDate.of(1999, APRIL, 1), 21);
        Student alex=new Student(2L, "Alex", "alex@gmail.com", LocalDate.of(2005, APRIL, 1), 21);

        repository.saveAll(List.of(mariam,alex));
    };
    }
}
