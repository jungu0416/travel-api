package dev.potatoo.travel.dbkey.request;

import dev.potatoo.travel.area.request.ApiRequest;
import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class DbRequest {
    private String dbKey;
    private ApiRequest apiRequest;

}
