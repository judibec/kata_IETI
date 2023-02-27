package com.adaschool.api.kata.controller.weather;

import com.adaschool.api.kata.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping( "/v1/weather" )
public class WeatherController {

    @Autowired
    WeatherService weatherService;



}
