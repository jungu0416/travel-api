package dev.potatoo.travel.area.request;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class ApiRequest {
    private String location;
}
