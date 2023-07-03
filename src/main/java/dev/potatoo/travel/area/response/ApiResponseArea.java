package dev.potatoo.travel.area.response;

import dev.potatoo.travel.domain.core.Area;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class ApiResponseArea {
    private String location;
    private String area;

    @Builder
    public ApiResponseArea(Area area) {
        this.location = area.getLocation();
        this.area = area.getArea();
    }

}
