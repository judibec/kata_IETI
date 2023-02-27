package com.adaschool.api.kata.repository.document;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Weather {

    @Id
    String id;

    Float temp;

    Float preassure;

    Float humidity;

    public Weather() {
    }

    public Weather(String id, Float temp, Float preassure, Float humidity) {
        this.id = id;
        this.temp = temp;
        this.preassure = preassure;
        this.humidity = humidity;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Float getTemp() {
        return temp;
    }

    public void setTemp(Float temp) {
        this.temp = temp;
    }

    public Float getPreassure() {
        return preassure;
    }

    public void setPreassure(Float preassure) {
        this.preassure = preassure;
    }

    public Float getHumidity() {
        return humidity;
    }

    public void setHumidity(Float humidity) {
        this.humidity = humidity;
    }
}
