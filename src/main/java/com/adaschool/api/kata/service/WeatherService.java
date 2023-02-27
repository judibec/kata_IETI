package com.adaschool.api.kata.service;

import com.adaschool.api.kata.repository.document.Weather;

public interface WeatherService {

    Weather createWeather(Weather weather);

    Weather findById(String id);


}
