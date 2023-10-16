package com.hwtoys.hwtoyscollection.hotwheeltoys.service;

import com.hwtoys.hwtoyscollection.hotwheeltoys.model.entity.HotWheelToy;
import org.springframework.data.domain.Page;


public interface HotWheelToyService {

    Page<HotWheelToy> getAll(int no, int size);

    Page<HotWheelToy> findAllByYear(String year);
}
