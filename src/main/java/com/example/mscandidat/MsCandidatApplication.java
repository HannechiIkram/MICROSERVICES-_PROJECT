package com.example.mscandidat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MsCandidatApplication {

    public static void main(String[] args) {
        SpringApplication.run(MsCandidatApplication.class, args);
    }
   // @Autowired
  //  private CategoryRepository repository;
    //@Bean
    //ApplicationRunner init() {
      //  return (args) -> {

          //  repository.save(new Candidat("Mariem", "Ch", "ma@esprit.tn"));
         //   repository.save(new Candidat("Sarra", "ab", "sa@esprit.tn"));
         //   repository.save(new Candidat("Mohamed", "ba", "mo@esprit.tn"));

         //   repository.findAll().forEach(System.out::println);

        };


