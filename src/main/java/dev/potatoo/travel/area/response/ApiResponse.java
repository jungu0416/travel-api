package dev.potatoo.travel.area.response;

import dev.potatoo.travel.domain.core.Area;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class ApiResponse {

    private String message;

    @Builder
    public ApiResponse(String message) {
        this.message = message;
    }

}
