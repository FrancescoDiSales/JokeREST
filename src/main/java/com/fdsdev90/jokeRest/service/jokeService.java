package com.fdsdev90.jokeRest.service;

import com.fdsdev90.jokeRest.model.jokeModel;
import org.springframework.web.client.RestTemplate;

public class jokeService
{


    public jokeModel serviceJoke()
    {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject("https://official-joke-api.appspot.com/random_joke",jokeModel.class);
    }


}
