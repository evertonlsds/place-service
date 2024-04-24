package br.com.placeservice.place.api;

import java.time.LocalDateTime;

public record PlaceRequest(
    String name, String slug, String city, String state, LocalDateTime createdAt, LocalDateTime updateAt
) {
    
}
