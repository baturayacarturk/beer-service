package com.beer_service.repositories;

import com.beer_service.domain.Beer;
import com.beer_service.web.model.BeerStyleEnum;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface BeerRepository extends JpaRepository<Beer, UUID> {
    
    Page<Beer> findAllByBeerName(String beerName, Pageable pageable);
    
    Page<Beer> findAllByBeerStyle(BeerStyleEnum beerStyle, Pageable pageable);
    
    Page<Beer> findAllByBeerNameAndBeerStyle(String beerName, BeerStyleEnum beerStyle, Pageable pageable);
}
