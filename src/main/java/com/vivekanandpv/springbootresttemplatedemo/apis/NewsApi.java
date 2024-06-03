package com.vivekanandpv.springbootresttemplatedemo.apis;

import com.vivekanandpv.springbootresttemplatedemo.models.WeatherResultViewModel;
import com.vivekanandpv.springbootresttemplatedemo.models.WeatherViewModel;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.time.LocalDateTime;

@RestController
@RequestMapping("api/v1/news")
public class NewsApi {
    private final RestTemplate restTemplate;

    public NewsApi(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @GetMapping("weather/{city}")
    public ResponseEntity<WeatherResultViewModel> getWeather(@PathVariable String city) {
        return ResponseEntity.ok(
                new WeatherResultViewModel(
                        city,
                        LocalDateTime.now(),
                        restTemplate
                                .getForObject(
                                        String.format(
                                                "/weather/by-city/%s",
                                                city
                                        ),
                                        WeatherViewModel.class
                                )
                )
        );
    }
}
