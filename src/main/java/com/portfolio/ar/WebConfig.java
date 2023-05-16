package com.portfolio.ar;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 *
 * @author Ariel
 */
@EnableWebMvc
@Configuration
public class WebConfig implements WebMvcConfigurer{
    public void addCrosMappings(CorsRegistry registry){
        registry.addMapping("/**");
    }
}
