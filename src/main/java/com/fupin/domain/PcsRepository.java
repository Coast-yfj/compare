package com.fupin.domain;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by luculent on 2017/4/1.
 */
@Repository
public interface PcsRepository extends PagingAndSortingRepository<PcsData,Long> {
}
