package com.vivekanandpv.springbootresttemplatedemo.models;

import java.time.LocalDateTime;

public class WeatherResultViewModel {
    private String city;
    private LocalDateTime updatedOn;
    private WeatherViewModel weatherData;

    public WeatherResultViewModel(String city, LocalDateTime updatedOn, WeatherViewModel weatherData) {
        this.city = city;
        this.updatedOn = updatedOn;
        this.weatherData = weatherData;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public LocalDateTime getUpdatedOn() {
        return updatedOn;
    }

    public void setUpdatedOn(LocalDateTime updatedOn) {
        this.updatedOn = updatedOn;
    }

    public WeatherViewModel getWeatherData() {
        return weatherData;
    }

    public void setWeatherData(WeatherViewModel weatherData) {
        this.weatherData = weatherData;
    }
}
