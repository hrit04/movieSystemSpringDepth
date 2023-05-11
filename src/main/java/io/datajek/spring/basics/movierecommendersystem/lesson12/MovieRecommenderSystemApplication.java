package io.datajek.spring.basics.movierecommendersystem.lesson12;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.ApplicationContext;


import java.util.Arrays;


@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class MovieRecommenderSystemApplication {

    public static void main(String[] args) {

        //ApplicationContext manages the beans and dependencies
        ApplicationContext appContext = SpringApplication.run(MovieRecommenderSystemApplication.class, args);

        //use ApplicationContext to get recommender object
        RecommenderImplementation recommender = appContext.getBean(RecommenderImplementation.class);

        System.out.println();
        System.out.println();
        System.out.println(recommender);

        //call method to get recommendations
        String[] result = recommender.recommendMovies("Finding Dory");

        //display results
        System.out.println();
        System.out.println();
        System.out.println(Arrays.toString(result));
    }
}