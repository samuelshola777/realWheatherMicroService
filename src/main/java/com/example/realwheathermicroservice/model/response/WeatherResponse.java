package com.example.realwheathermicroservice.model.response;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
public class WeatherResponse {

    private Coordinates coordinates;
    private Weather[] weather;
    private Mains main;

}
