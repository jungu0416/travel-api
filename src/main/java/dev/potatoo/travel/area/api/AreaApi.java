package dev.potatoo.travel.area.api;

import dev.potatoo.travel.area.response.ApiResponseArea;
import dev.potatoo.travel.area.service.AreaService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class AreaApi {

    private final AreaService areaService;

    @GetMapping("/check/area")
    public ResponseEntity<List<ApiResponseArea>> checkArea() {
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(areaService.checkArea());
    }




}
