package com.hwtoys.hwtoyscollection.hotwheeltoys.service.impl;

import com.hwtoys.hwtoyscollection.hotwheeltoys.model.entity.HotWheelToy;
import com.hwtoys.hwtoyscollection.hotwheeltoys.repository.HotWheelToyRepository;
import com.hwtoys.hwtoyscollection.hotwheeltoys.service.HotWheelToyService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
@RequiredArgsConstructor
public class HotWheelToyServiceImpl implements HotWheelToyService {

    private final HotWheelToyRepository hotWheelToyRepository;

    @Override
    public Page<HotWheelToy> getAll(int page, int size) {
        Pageable pageable = PageRequest.of(page, size);
        Page<HotWheelToy> hotWheelToyPage = hotWheelToyRepository.findAll(pageable);
        return hotWheelToyPage;
    }

    @Override
    public Page<HotWheelToy> findAllByYear(String year) {
        Pageable pageable = PageRequest.of(0, 10000);
        Page<HotWheelToy> hotWheelToyPage = hotWheelToyRepository.findAllByYear(pageable,year);
        return hotWheelToyPage;
    }
}
