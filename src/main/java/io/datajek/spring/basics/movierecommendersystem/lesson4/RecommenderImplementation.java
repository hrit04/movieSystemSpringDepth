package io.datajek.spring.basics.movierecommendersystem.lesson4;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class RecommenderImplementation {

    @Autowired
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
