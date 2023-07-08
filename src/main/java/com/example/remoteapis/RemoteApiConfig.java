package com.example.remoteapis;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;


@Configuration
// @Configuration ,ye jvm ko batata hai ki ye waali  class, java ki configuration batayegi
// or ye sirf inbuilt classes ke beans ke liye use karte hai ,, jaise yaha RestTemplate ek inbuilt class hai
// or spring jab iss class mein aayega toh wo dekhega ki, which all are the beans that i have to create on runtime
public class RemoteApiConfig {
    @Bean
    public RestTemplate getRestTemplate(RestTemplateBuilder restTemplateBuilder){
        return restTemplateBuilder.build();
    }
}
