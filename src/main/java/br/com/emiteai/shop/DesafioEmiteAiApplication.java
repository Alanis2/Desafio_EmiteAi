package br.com.emiteai.shop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class DesafioEmiteAiApplication {

    public static void main(String[] args) {
        SpringApplication.run(DesafioEmiteAiApplication.class, args);
    }

}
