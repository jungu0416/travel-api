package dev.potatoo.travel.dbkey.api;

import dev.potatoo.travel.area.response.ApiResponse;
import dev.potatoo.travel.dbkey.request.DbRequest;
import dev.potatoo.travel.dbkey.service.DbService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
@CrossOrigin("*")
public class DbApi {

    private final DbService dbService;

    @PostMapping("/dbKey")
    public ResponseEntity<ApiResponse> getDbKey(@RequestBody DbRequest dbRequest) {

        return ResponseEntity
                .status(HttpStatus.OK)
                .body(dbService.checkDbKey(dbRequest));
    }

}
