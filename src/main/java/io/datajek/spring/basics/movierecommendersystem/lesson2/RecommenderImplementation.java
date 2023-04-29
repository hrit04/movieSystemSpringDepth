package io.datajek.spring.basics.movierecommendersystem.lesson2;

import io.datajek.spring.basics.movierecommendersystem.lesson1.ContentBasedFilter;

public class RecommenderImplementation {

    private Filter filter;
    public RecommenderImplementation(Filter filter) {
        super();
        this.filter = filter;
    }
    public String[] recommendMovies (String movie) {
        //use content based filter to find similar movies
        //return the results
      //  CollaborativeFilter filter = new CollaborativeFilter();


        String[] results = filter.getRecommendations(movie);
        return results;
    }
}
