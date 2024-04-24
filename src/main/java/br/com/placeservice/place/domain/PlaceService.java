package br.com.placeservice.place.domain;

import com.github.slugify.Slugify;

import br.com.placeservice.place.api.PlaceRequest;
import reactor.core.publisher.Mono;

public class PlaceService {
    private PlaceRepository placeRepository;
    private Slugify slg;

    public PlaceService(PlaceRepository placeRepository) {
        this.placeRepository = placeRepository;
        this.slg = Slugify.builder().build();
    }

    public Mono<Place> create(PlaceRequest placeRequest){
        var place = new Place(null, placeRequest.name(), slg.slugify(placeRequest.name()), placeRequest.state(), placeRequest.createdAt(), placeRequest.updateAt());
        return placeRepository.save(place);
    }
}
