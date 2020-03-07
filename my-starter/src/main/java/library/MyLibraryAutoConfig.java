package library;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.beans.ConstructorProperties;

@Configuration
public class MyLibraryAutoConfig {

    @Bean
    MyLibraryClass myLibraryClass() {
        return new MyLibraryClass();
    }

    @Bean
    @CondionalOnProperty(value = "Application.properties", havingValue = "default")
    MyLibraryClass myClass(){
        return new MyLibraryClass("default");
    }

    @Bean
    @CondionalOnProperty(value = "my.property", havingValue = "custom")
    MyLibraryClass myClass(){
        return new MyLibraryClass("custom");
    }
}
