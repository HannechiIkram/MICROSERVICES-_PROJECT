package com.example.category;

////import com.example.category.controller.CategoryController;
//////import com.example.category.entity.Category;
/////import com.example.category.repository.CategoryRepository;
/////import org.springframework.beans.factory.annotation.Autowired;
/////import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

///import org.springframework.context.annotation.Bean;
//@EnableEurekaClient
@SpringBootApplication
public class CategoryApplication {

    public static void main(String[] args) {
        SpringApplication.run(CategoryApplication.class, args);
    }
///@Autowired
///private CategoryRepository repository;
///@Bean
    ////ApplicationRunner init(){
  /////////return (args) ->  {
 /// repository.save(new Category(nom: "mariem", type: "jjjj", description:"olp"));
 /////////// repository.findAll().forEach(System.out::println);};

/////}

}
