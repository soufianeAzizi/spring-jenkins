package com.javatechie.springjenkins;

import jakarta.annotation.PostConstruct;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class SpringJenkinsApplication {


  public static Logger logger = LoggerFactory.getLogger(SpringJenkinsApplication.class);

  @PostConstruct
  public void initt (){
    logger.info("Application started ...");
  }

  public static void main(String[] args) {
    logger.info("Application executed ...");
    SpringApplication.run(SpringJenkinsApplication.class, args);
  }

}
