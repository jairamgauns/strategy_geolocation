package com.sample.geolocation.service;

import com.sample.geolocation.model.Result;

public interface GeolocationService {

    // to identify support for the provider
    GeolocationProvider getGeoProvider();

    //method will have the provider specific logic to find the latitude/longitude
    Result getLatLongByCity(String city);
}
