package io.datajek.spring.basics.movierecommendersystem.lesson1;

import io.datajek.spring.basics.movierecommendersystem.lesson2.Filter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.Arrays;
import java.io.*;

@SpringBootApplication
public class MovieRecommenderSystemApplication {


	public static void main(String[] args) {

		//SpringApplication.run(MovieRecommenderSystemApplication.class, args);
		//RecommenderImplementation recommender = new RecommenderImplementation();
		RecommenderImplementation recommender = new RecommenderImplementation((Filter) new ContentBasedFilter());
		String[] result = recommender.recommendMovies("Finding Dory");
		System.out.println(Arrays.toString(result));

	}

}
