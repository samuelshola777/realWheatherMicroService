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
    ResponseEntity<WeatherResponse> response = new RestTemplate().getForEntity("https://api.openweathermap.org/data/2" +
            ".5/weather?lat=6.52319&lon=3.38044&appid=20f050" +
            "6e31e420c5bc9889700b4310aa", WeatherResponse.class);
return response.getBody();
}

}
