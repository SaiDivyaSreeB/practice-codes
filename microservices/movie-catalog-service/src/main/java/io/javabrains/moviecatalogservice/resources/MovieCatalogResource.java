package io.javabrains.moviecatalogservice.resources;
import com.netflix.discovery.DiscoveryClient;
import io.javabrains.moviecatalogservice.models.CatalogItem;
import io.javabrains.moviecatalogservice.models.Movie;
import io.javabrains.moviecatalogservice.models.UserRating;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import io.javabrains.moviecatalogservice.models.Rating;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.List;
import java.util.stream.Collectors;
import java.util.Collections;
import java.util.Arrays;

@RestController
@RequestMapping("/catalog")
public class MovieCatalogResource {
    @Autowired
    private RestTemplate restTemplate;

    @Autowired
     private WebClient.Builder webClientBuilder;

    @RequestMapping("/{userId}")
    public List<CatalogItem> getCatalog(@PathVariable("userId")String userId){
      
        //get all rated movie ids ratings
        UserRating ratings = restTemplate.getForObject("http://data-ratings-service/ratingsdata/users/"+userId, UserRating.class);
        //for each id call movie info service and get details

      return  ratings.getUserRating().stream().map(rating ->
            { Movie movie = restTemplate.getForObject
                    ("http://movie-info-service/movies/"+rating.getMovieId(),Movie.class);
            return new CatalogItem(movie.getName(),"Desc",rating.getRating());
            })
                      .collect(Collectors.toList());
        //put them all together


    }
}
