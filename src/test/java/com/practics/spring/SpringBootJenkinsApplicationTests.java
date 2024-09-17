package com.practics.spring;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.logging.Logger;

import org.junit.jupiter.api.Test;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringBootJenkinsApplicationTests {
    public static org.slf4j.Logger logger= LoggerFactory.getLogger(SpringBootJenkinsApplicationTests.class);
    
    @Test
	void contextLoads() {

		 logger.info("Test case excecuted");
		
	}
    
    

}
