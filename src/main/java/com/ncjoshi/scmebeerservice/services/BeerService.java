package com.ncjoshi.scmebeerservice.services;

import com.ncjoshi.scmebeerservice.web.model.BeerDto;

import java.util.UUID;

/**
 * Created by ncj on 12 Oct, 2020.
 */
public interface BeerService {
    BeerDto getBeerById(UUID beerId);

    BeerDto saveNewBeer(BeerDto beerDto);

    BeerDto updateBeer(UUID beerId, BeerDto beerDto);
}
