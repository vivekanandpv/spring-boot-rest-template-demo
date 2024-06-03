package com.vivekanandpv.springbootresttemplateupstream.apis;

import com.vivekanandpv.springbootresttemplateupstream.models.WeatherDetail;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/weather")
public class WeatherApi {
    @GetMapping("by-city/{city}")
    public ResponseEntity<WeatherDetail> getByCity(@PathVariable String city) {
        return ResponseEntity.ok(new WeatherDetail(
                city,
                24,
                35,
                73,
                45
        ));
    }
}
