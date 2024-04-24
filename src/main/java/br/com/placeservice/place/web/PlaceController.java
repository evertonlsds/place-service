package br.com.placeservice.place.web;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.placeservice.place.api.PlaceRequest;
import br.com.placeservice.place.api.PlaceResponse;
import br.com.placeservice.place.domain.Place;
import br.com.placeservice.place.domain.PlaceService;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/places")
public class PlaceController {

    private PlaceService placeService;

    public PlaceController(PlaceService placeService) {
        this.placeService = placeService;
    }

    @PostMapping
    public ResponseEntity<Mono<PlaceResponse>> create(@RequestBody PlaceRequest request) {
        var createdPlace = placeService.create(request);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdPlace);
    }

}
