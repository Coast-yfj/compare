package com.fupin.domain;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by luculent on 2017/3/31.
 */
@Repository
public interface FpbRepository extends PagingAndSortingRepository<FpbData,Long> {


}
