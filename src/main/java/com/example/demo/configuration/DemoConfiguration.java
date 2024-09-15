package  com.example.demo.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DemoConfiguration{
    
    @Bean
    public String hello(){
        return "Hello World";
    }

}