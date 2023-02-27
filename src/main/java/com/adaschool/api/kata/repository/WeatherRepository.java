package com.adaschool.api.kata.repository;

import com.adaschool.api.kata.repository.document.Weather;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface WeatherRepository extends MongoRepository<Weather,String> {
}
