package com.example.realwheathermicroservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class weatherController {
@GetMapping("/test")
public String test(){
   return "microService update weather MY NAME IS SAMUEL SHOLA";
}


}
