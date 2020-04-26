package com.fdsdev90.jokeRest.jokeRest;

import com.fdsdev90.jokeRest.model.jokeModel;
import com.fdsdev90.jokeRest.service.jokeService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class jokeController
{

    @GetMapping("/random")
    public ResponseEntity<jokeModel> getJoke()
    {
        jokeService service = new jokeService();
        ResponseEntity<jokeModel> resultJoke = service.serviceJoke();

        return resultJoke;
    }


}
