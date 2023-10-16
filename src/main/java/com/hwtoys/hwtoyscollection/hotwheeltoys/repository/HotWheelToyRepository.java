package com.hwtoys.hwtoyscollection.hotwheeltoys.repository;

import com.hwtoys.hwtoyscollection.hotwheeltoys.model.entity.HotWheelToy;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface HotWheelToyRepository extends PagingAndSortingRepository<HotWheelToy,Long> {

    Page<HotWheelToy> findAllByYear(Pageable pageable, String Year);
}
