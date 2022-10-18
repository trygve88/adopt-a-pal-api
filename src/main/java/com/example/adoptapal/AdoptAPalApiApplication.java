package com.example.adoptapal;

import com.example.adoptapal.config.RsaKeyProperties;
import com.example.adoptapal.util.MyConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@EnableConfigurationProperties(RsaKeyProperties.class)
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
