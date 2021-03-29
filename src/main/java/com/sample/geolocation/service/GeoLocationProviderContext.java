package com.sample.geolocation.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.EnumMap;
import java.util.Set;

@Component
public class GeoLocationProviderContext {

    /**
     * Initialize a factory of services
     */
    private final EnumMap<GeolocationProvider, GeolocationService> map;

    @Autowired
    public GeoLocationProviderContext(Set<GeolocationService> geolocationServiceSet) {
        map = new EnumMap<>(GeolocationProvider.class);
        geolocationServiceSet.forEach(service -> map.put(service.getGeoProvider(), service));
    }

    /**
     * Get the underlying service based on the provider
     * @param provider
     * @return
     */
    public GeolocationService getService(GeolocationProvider provider) {
        return map.get(provider);
    }

}

