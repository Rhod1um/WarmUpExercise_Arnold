package com.example.warmupexercise.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller  //skal have @Controller fordi den returnerer html. @RestController returnere json
public class arnoldController {
  @GetMapping("/")
  public String index(){
    return "Home/index";
  }
  //returtype skal altid være String
  //alle billeder skal ligge under static under ressources.
  //de skal ligge der ellers virker det ikke
  //vil man lægge et billede ind skal det downloades og ligges i static mappen

  @GetMapping("/about")
  public String about(){
    return "Home/about"; //husk stien! Der er lavet en undermappe under templates!!
  }

  @GetMapping("/boxes")
  public String boxes(){return "Home/boxes/boxes";}
}
