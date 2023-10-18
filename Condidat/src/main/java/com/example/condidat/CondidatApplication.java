package com.example.condidat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

@SpringBootApplication
@EnableEurekaClient

public class CondidatApplication {

    public static void main(String[] args) {
        SpringApplication.run(CondidatApplication.class, args);
    }


    @Autowired
    private  CondidatRepository condidatRepository;

    @Bean
    ApplicationRunner init (){//est une interface de Spring Boot qui permet d'exécuter du code au démarrage d'une application Spring Boot//init Elle retourne un objet qui implémente l'interface ApplicationRunner
      return  (args) -> {
          //save
          condidatRepository.save( new Condidat("mariem","ch","ma@esprit.tn"));
          condidatRepository.save( new Condidat("haykel","mhadhbi","haykel@esprit.tn"));
          condidatRepository.save( new Condidat("fatma","nouioui","fatma@esprit.tn"));
          condidatRepository.save( new Condidat("fatdma"));

//fetch
            condidatRepository.findAll().forEach(System.out::println);

      }  ;
    }
}
