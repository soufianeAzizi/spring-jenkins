package com.javatechie.springjenkins;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
class SpringJenkinsApplicationTests {
  public static Logger logger = LoggerFactory.getLogger(SpringJenkinsApplicationTests.class);

  @Test
  public void contextLoads() {
    logger.info("Test case executing ...");
    logger.info("Test third case executing ...");
    assertEquals(true,true);
  }

}
