package io.datajek.spring.basics.movierecommendersystem.lesson13;


import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Named
public class RecommenderImplementation {

    @Autowired
    @Qualifier("CF")
    private Filter filter;

    public Filter getFilter() {
        return filter;
    }



    //use a filter to find recommendations
    public String [] recommendMovies (String movie) {

        //print the name of interface implementation being used
        System.out.println("\nName of the filter in use: " + filter + "\n");

        String[] results = filter.getRecommendations("Finding Dory");

        return results;
    }


}