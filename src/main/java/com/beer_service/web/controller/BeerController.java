package com.beer_service.web.controller;

import com.beer_service.services.BeerService;
import com.beer_service.web.model.BeerDto;
import com.beer_service.web.model.BeerPagedList;
import com.beer_service.web.model.BeerStyleEnum;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("api/v1/beer")
@RequiredArgsConstructor
public class BeerController {
    private static final Integer DEFAULT_PAGE_NUMBER = 0;
    private static final Integer DEFAULT_PAGE_SIZE = 25;

    private final BeerService beerService;

    @GetMapping(produces = {"application/json"})
    public ResponseEntity<BeerPagedList> listBeers(@RequestParam(value = "pageNumber", required = false) Integer pageNumber,
                                                   @RequestParam(value = "pageSize", required = false) Integer pageSize,
                                                   @RequestParam(value = "beerName", required = false) String beerName,
                                                   @RequestParam(value = "beerStyle", required = false) BeerStyleEnum beerStyle){
        if(pageNumber == null || pageNumber <0){
            pageNumber = DEFAULT_PAGE_NUMBER;
        }
        if(pageSize == null || pageSize<1){
            pageSize = DEFAULT_PAGE_SIZE;
        }

        BeerPagedList beerList = beerService.listBeers(beerName,beerStyle, PageRequest.of(pageNumber,pageSize));
        return new ResponseEntity<>(beerList, HttpStatus.OK);

    }

    @GetMapping("/{beerId}")
    public ResponseEntity<BeerDto> getBeerById(UUID beerId){
        return new ResponseEntity<>(beerService.getById(beerId),HttpStatus.OK);
    }
    @PostMapping
    public ResponseEntity<BeerDto> saveNewBeer(@RequestBody @Validated BeerDto beerDto){
        return new ResponseEntity<>(beerService.saveNewBeer(beerDto),HttpStatus.CREATED);

    }
    @PutMapping("/{beerId}")
    public ResponseEntity<BeerDto> updateBeerById(UUID beerId, @RequestBody @Validated BeerDto beerDto){
        return new ResponseEntity<>(beerService.updateBeer(beerId,beerDto),HttpStatus.NO_CONTENT);
    }
}
