package com.example.demo.config;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//used when dealing with external jar or with source code that cannot be controlled
@Configuration
public class ChuckConfiguration {

    @Bean
    public ChuckNorrisQuotes chuckNorrisQuotes() {
        return new ChuckNorrisQuotes();
    }
}
