package com.fdsdev90.jokeRest.service;

import com.fdsdev90.jokeRest.model.jokeModel;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class jokeService
{


    public jokeModel serviceJoke()
    {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject("https://official-joke-api.appspot.com/random_joke",jokeModel.class);
    }

    public jokeModel[] getServiceJokeByType(String type)
    {
        RestTemplate restTemplate = new RestTemplate();

            if(type.length()==0)
            {
                return null;
            }

        ResponseEntity<jokeModel[]> responseEntity = restTemplate.getForEntity("https://official-joke-api.appspot.com/jokes/"+type+"/random",jokeModel[].class);
        jokeModel[] jokeModels = responseEntity.getBody();

        return  jokeModels;
    }

}
