package dev.potatoo.travel.area.api;

import dev.potatoo.travel.area.request.ApiRequest;
import dev.potatoo.travel.area.response.ApiResponseArea;
import dev.potatoo.travel.area.response.ApiResponse;
import dev.potatoo.travel.area.service.AreaService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
@CrossOrigin("*")
public class AreaApi {

    private final AreaService areaService;

    @GetMapping("/area")
    public ResponseEntity<List<ApiResponseArea>> checkArea() {
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(areaService.checkArea());
    }

    @PostMapping("/area")
    public ResponseEntity<ApiResponse> insertArea(@RequestBody ApiRequest apiRequest) {
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(areaService.insertArea(apiRequest));
    }

    @PutMapping("/area")
    public ResponseEntity<ApiResponse> updateArea(@RequestBody ApiRequest apiRequest) {
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(areaService.updateArea(apiRequest));
    }

}
