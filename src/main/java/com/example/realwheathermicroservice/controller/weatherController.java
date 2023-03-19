package com.example.realwheathermicroservice.controller;

import com.example.realwheathermicroservice.model.response.WeatherResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class weatherController {
@GetMapping("/test")
public String test(){
   return "microService update weather MY NAME IS SAMUEL SHOLA";
}
@GetMapping("/getWeather")
public WeatherResponse getWeather(){
  
return response.getBody();
}

}
