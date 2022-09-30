package com.example.v1;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class StoryConfig {
    @Bean
    CommandLineRunner commandLineRunner(StoryRepo  storyRepo){
        return args -> {
           Story s= new Story("Damoy Williams","started off Majoring in Computer Engineering, i was not really passionate about so switch to Computer Science. Since then  i have been engage, focus and passionate about coding. how passionate am i? How Different algorithms works  keep me up at night lol ","Computer Science","Shepherd University",3.0);
            storyRepo.save(s);
        };



    };

}
