package com.adaschool.api.kata.repository;

import com.adaschool.api.kata.repository.document.Location;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface LocationRepository extends MongoRepository<Location,String>{
}
