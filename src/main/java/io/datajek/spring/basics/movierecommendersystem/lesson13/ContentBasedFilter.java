package io.datajek.spring.basics.movierecommendersystem.lesson13;


import io.datajek.spring.basics.movierecommendersystem.lesson13.Filter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.inject.Named;

import javax.inject.Named;
import org.springframework.beans.factory.annotation.Qualifier;

@Named
@Qualifier("CBF")
public class ContentBasedFilter implements Filter{

    //getRecommendations takes a movie as input and returns a list of similar movies
    public String[] getRecommendations(String movie) {
        //implement logic of content based filter
        return new String[] {"Happy Feet", "Ice Age", "Shark Tale"};
    }
}