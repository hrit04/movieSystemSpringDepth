package io.datajek.spring.basics.movierecommendersystem.lesson6;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/*


precedence in annotation:

1.qualifier ->
2.@primary
3.name

 */



@Component
public class RecommenderImplementation {

    @Autowired
    @Qualifier("CBF")
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
