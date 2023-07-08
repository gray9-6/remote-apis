package com.example.remoteapis;

import com.example.remoteapis.model.MovieResponse_ModelClass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/remote")
public class RemoteApiController {

    @Autowired
    // restTemplate is an inbuilt java class that help me to call remote apis,
    // whenever we have to call the api which is not in your application,, or you can say whenever we have to
    // call the 3rd part api ,, we need the RestTemplate object
    // and we can autowired only those classes, jin classes ka bean ho hamare paas
    // and to create a bean of restTemplate we have to define the configuration
    RestTemplate restTemplate;
    @GetMapping("/get")
    // when we don't know the return type of any method / Object then just simply return the Object
    // because the Object class is parent of all the classes,,
    public Object getMoviesDetails(){
        // i have got the rest api, which is in  url ,,which i have taken from the internet
        // (i.e from TMDB the movie database),, and i am accessing it for my application
        String  url = "https://api.themoviedb.org/3/movie/157336?api_key=92ca34b673a4fd53b56f4afd8f84e034";
        // the restTemplate class have some methods which can be called by its object ,
        // one of the method is, .getForObject() , in which i have to provide the two things
        // first- url,, second is the class of the return type ( here in this api the return type of class is Object)
        // so basically second parameter ye bol raha hai ki ,whatever response you are getting from this api fit it in that class
        // and it will return me the object ,, so i have created a refrence variable for object class i.e responseObject
        Object responseObject =  restTemplate.getForObject(url, Object.class);
        return  responseObject;
    }


    // when we want only things which we have defined in our Model class
    @GetMapping("/get_custom_details")
    public MovieResponse_ModelClass getCustomMovieDetails(){
        String  url = "https://api.themoviedb.org/3/movie/157336?api_key=92ca34b673a4fd53b56f4afd8f84e034";
        // yaha humne movieResponse class mein 4 attributes declare kiye hai ,, jisme se 3 attribute
        // hume jo response mil rha hai usme hai ,, but random uss response mein nahi hai
        // toh it simply map the data to the response which we are getting
        MovieResponse_ModelClass responseObject =  restTemplate.getForObject(url, MovieResponse_ModelClass.class);
        return  responseObject;
    }

}
