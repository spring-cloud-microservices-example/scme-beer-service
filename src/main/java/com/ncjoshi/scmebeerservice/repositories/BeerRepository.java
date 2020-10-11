package com.ncjoshi.scmebeerservice.repositories;

import com.ncjoshi.scmebeerservice.domain.Beer;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.UUID;

/**
 * Created by ncj on 11 Oct, 2020.
 */
public interface BeerRepository extends PagingAndSortingRepository<Beer, UUID> {
}
