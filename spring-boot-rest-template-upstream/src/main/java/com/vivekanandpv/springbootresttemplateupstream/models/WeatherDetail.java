package com.vivekanandpv.springbootresttemplateupstream.models;

public class WeatherDetail {
    private String city;
    private double minimumTemperature;
    private double maximumTemperature;
    private int aqi;
    private double humidityPercentage;

    public WeatherDetail(
            String city,
            double minimumTemperature,
            double maximumTemperature,
            int aqi,
            double humidityPercentage
    ) {
        this.city = city;
        this.minimumTemperature = minimumTemperature;
        this.maximumTemperature = maximumTemperature;
        this.aqi = aqi;
        this.humidityPercentage = humidityPercentage;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public double getMinimumTemperature() {
        return minimumTemperature;
    }

    public void setMinimumTemperature(double minimumTemperature) {
        this.minimumTemperature = minimumTemperature;
    }

    public double getMaximumTemperature() {
        return maximumTemperature;
    }

    public void setMaximumTemperature(double maximumTemperature) {
        this.maximumTemperature = maximumTemperature;
    }

    public int getAqi() {
        return aqi;
    }

    public void setAqi(int aqi) {
        this.aqi = aqi;
    }

    public double getHumidityPercentage() {
        return humidityPercentage;
    }

    public void setHumidityPercentage(double humidityPercentage) {
        this.humidityPercentage = humidityPercentage;
    }
}
