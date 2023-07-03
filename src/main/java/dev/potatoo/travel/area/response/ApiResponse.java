package dev.potatoo.travel.area.response;

import dev.potatoo.travel.domain.core.Area;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class ApiResponse {

    private String check;

    private String location;
    private String area;
    @Builder
    public ApiResponse(Area area) {
        this.check = "OK";
        this.location = area.getLocation();
        this.area = area.getArea();
    }

}
