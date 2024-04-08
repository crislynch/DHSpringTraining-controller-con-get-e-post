package com.example.controllercongetepost;

import org.springframework.web.bind.annotation.*;

//scrivi una applicazione web Spring Boot con:
//NameController dove si mappa il parametro name per:
//restituire il nome alla chiamata GET
//restuiture il nome al contrario (es. da John a nhoJ, usando StringBuilder) alla chiamata POST
//testare le chiamate del API endpoint usando Postman
@RestController
public class Controller {
    @RequestMapping(method = RequestMethod.GET, path = "/name")

    public String name(@RequestParam String name) {
        return name;
    }


    @RequestMapping(method = RequestMethod.POST, path = "/reverse")

    public String reverse(@RequestBody String name) {
        return new StringBuilder(name).reverse().toString();
    }
}
