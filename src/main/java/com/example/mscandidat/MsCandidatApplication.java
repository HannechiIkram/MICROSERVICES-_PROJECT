package com.example.mscandidat;

import com.example.mscandidat.Entity.Category;
import com.example.mscandidat.Repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableEurekaClient
public class MsCandidatApplication {

    public static void main(String[] args) {
        SpringApplication.run(MsCandidatApplication.class, args);
    }
    @Autowired
    private CategoryRepository Repository;
    @Bean
    ApplicationRunner init() {
        return (args) -> {

          Repository.save(new Category("Mariem", "Ch", "ma@esprit.tn"));
            Repository.save(new Category("Sarra", "ab", "sa@esprit.tn"));
            Repository.save(new Category("Mohamed", "ba", "mo@esprit.tn"));

            Repository.findAll().forEach(System.out::println);

        };}}


