package br.com.placeservice.place.web;

import br.com.placeservice.place.api.PlaceResponse;
import br.com.placeservice.place.domain.Place;

public class PlaceMapper {
    public static PlaceResponse fromPlaceResponse(Place place){
        return new PlaceResponse(place.name(), place.slug(),place.state(), place.createdAt(), place.updateAt());
    }
}
