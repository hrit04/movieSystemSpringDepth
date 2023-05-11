package io.datajek.spring.basics.movierecommendersystem.lesson13;
import io.datajek.spring.basics.movierecommendersystem.lesson6.Filter;
import org.springframework.stereotype.Component;

import javax.inject.Named;

import javax.inject.Named;
import org.springframework.beans.factory.annotation.Qualifier;

@Named
@Qualifier("CF")
public class CollaborativeFilter implements Filter{

    public String[] getRecommendations(String movie) {
        //logic of collaborative filter
        return new String[] {"Finding Nemo", "Ice Age", "Toy Story"};
    }
}