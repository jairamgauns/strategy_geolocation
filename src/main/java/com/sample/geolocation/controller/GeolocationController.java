package com.sample.geolocation.controller;

import com.sample.geolocation.model.Result;
import com.sample.geolocation.service.GeoLocationProviderContext;
import com.sample.geolocation.service.GeolocationProvider;
import com.sample.geolocation.service.GeolocationService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;

@RestController
public class GeolocationController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    GeoLocationProviderContext geoLocationProviderContext;

    /**
     * Pick up the underlying geo location service dynamically andget the latitude/longitude
     * @param city
     * @param provider
     * @return
     */
    @GetMapping(value = "/coordinates/for/city/{cityname}/{provider}")
    public ResponseEntity<Result> getLocation(@PathParam(value = "cityname") String city,
                                              @PathParam(value = "provider")GeolocationProvider provider) {
        GeolocationService geolocationService = geoLocationProviderContext.getService(provider);
        Result result = geolocationService.getLatLongByCity(city);
        return ResponseEntity.ok().body(result);
    }
}
