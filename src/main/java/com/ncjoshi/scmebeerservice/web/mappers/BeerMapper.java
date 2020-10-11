package com.ncjoshi.scmebeerservice.web.mappers;

import com.ncjoshi.scmebeerservice.domain.Beer;
import com.ncjoshi.scmebeerservice.web.model.BeerDto;
import org.mapstruct.Mapper;

/**
 * Created by ncj on 11 Oct, 2020.
 */
@Mapper(uses = { DateMapper.class })
public interface BeerMapper {

    BeerDto beerToBeerDto(Beer beer);

    Beer beerDtoToBeer(BeerDto beerDto);
}
