package br.com.placeservice.place.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import br.com.placeservice.place.domain.PlaceRepository;
import br.com.placeservice.place.domain.PlaceService;

@Configuration
public class placeConfig {

    @Bean
    PlaceService placeService(PlaceRepository placeRepository){
        return new PlaceService(placeRepository);
    }
    
}
