package kr.ac.hansung.cse;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootWebServiceApplication {
    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(SpringbootWebServiceApplication.class);
        application.run(args);

    }
}
