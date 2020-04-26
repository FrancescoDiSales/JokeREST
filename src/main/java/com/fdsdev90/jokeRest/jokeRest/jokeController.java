package com.fdsdev90.jokeRest.jokeRest;

import com.fdsdev90.jokeRest.model.jokeModel;
import com.fdsdev90.jokeRest.service.jokeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class jokeController
{

    @GetMapping("/random")
    public jokeModel getJoke()
    {
        jokeService service = new jokeService();
        jokeModel resultJoke = service.serviceJoke();

        return resultJoke;
    }

    @GetMapping("/joke/{type}")
    public jokeModel[] getTypeJoke(@PathVariable("type") String typeJoke)
    {
        jokeService service = new jokeService();
        jokeModel [] resultJoke = service.getServiceJokeByType(typeJoke);

        if(resultJoke.length==0)
        {
            return null;
        }

        return resultJoke;
    }

}
