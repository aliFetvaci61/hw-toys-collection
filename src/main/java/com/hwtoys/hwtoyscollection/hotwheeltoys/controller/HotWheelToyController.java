package com.hwtoys.hwtoyscollection.hotwheeltoys.controller;


import com.hwtoys.hwtoyscollection.hotwheeltoys.model.entity.HotWheelToy;
import com.hwtoys.hwtoyscollection.hotwheeltoys.service.HotWheelToyService;
import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/hot-wheel-toys")
@Slf4j
@RequiredArgsConstructor
public class HotWheelToyController {

    private final HotWheelToyService hotWheelToyService;

    @GetMapping
    public ResponseEntity<Page<HotWheelToy>> getAll(@RequestParam String year) {

        Page<HotWheelToy> all = hotWheelToyService.findAllByYear(year);
        return new ResponseEntity<>(all, HttpStatus.OK);
    }

    @PostMapping
    @RequestMapping("/login")
    public ResponseEntity<Response> login() {

        Response deneme = Response.builder().token("deneme").build();
        return new ResponseEntity<>(deneme, HttpStatus.OK);
    }


}


@Getter
@Setter
@Builder
class Response {

    private String token;

}
