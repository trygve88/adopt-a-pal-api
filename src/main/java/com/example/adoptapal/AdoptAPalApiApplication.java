package com.example.adoptapal;

import com.example.adoptapal.util.MyConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class AdoptAPalApiApplication {

    public static void main(String[] args) {
        // CORS
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(MyConfiguration.class);
        ctx.refresh();
        ctx.close();

        SpringApplication.run(AdoptAPalApiApplication.class, args);
    }

}
