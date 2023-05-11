package io.datajek.spring.basics.movierecommendersystem.lesson11;

import io.datajek.spring.basics.movierecommendersystem.lesson10.ContentBasedFilter;
import io.datajek.spring.basics.movierecommendersystem.lesson10.Movie;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;


@SpringBootApplication
@ComponentScan(basePackages="io.datajek.spring.basics.movierecommendersystem.lesson7")
@ComponentScan(includeFilters = @ComponentScan.Filter (type= FilterType.REGEX, pattern="io.datajek.spring.basics.movierecommendersystem.lesson7.*"))
public class MovieRecommenderSystemApplication {

    public static void main(String[] args) {

        //ApplicationContext manages the beans and dependencies
        ApplicationContext appContext = SpringApplication.run(MovieRecommenderSystemApplication.class, args);

        //check if beans are found
        System.out.println("CollaborativeFilter bean found = " + appContext.containsBean("collaborativeFilter"));
        System.out.println("ContentBasedFilter bean found = " + appContext.containsBean("contentBasedFilter"));
    }
}