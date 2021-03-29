package com.sample.geolocation.service.impl;

import com.sample.geolocation.model.Result;
import com.sample.geolocation.service.GeolocationProvider;
import com.sample.geolocation.service.GeolocationService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class GeoBoundariesLocationServiceImpl implements GeolocationService {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Override
    public GeolocationProvider getGeoProvider() {
        return GeolocationProvider.GEO_BOUNDARIES;
    }

    @Override
    public Result getLatLongByCity(String city) {
        // implement the logic of how to process the details, preparing the data model and calling the geoboundaries API
        // For demonstration sake we will pass back a dummy response

        logger.info("Using Geo Boundaries Service implementation");

        return new Result("-33.86","151.20");
    }
}
