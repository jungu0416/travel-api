package dev.potatoo.travel.area.service;

import dev.potatoo.travel.area.request.ApiRequest;
import dev.potatoo.travel.area.response.ApiResponseArea;
import dev.potatoo.travel.area.response.ApiResponse;
import dev.potatoo.travel.domain.core.Area;
import dev.potatoo.travel.domain.repository.AreaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class AreaService {

    private final AreaRepository areaRepository;

    public List<ApiResponseArea> checkArea() {

        List<Area> areaList = areaRepository.findAllByArea("Y");

        List<ApiResponseArea> apiResponseArea = areaList.stream()
                                                    .map(area ->
                                                         ApiResponseArea.builder()
                                                                 .area(area)
                                                                 .build()
                                                    )
                                                    .collect(Collectors.toList());

        return apiResponseArea;
    }

    public ApiResponse insertArea(ApiRequest apiRequest) {
        Area area = new Area();

        area.insertArea(apiRequest);
        areaRepository.save(area);

        ApiResponse apiResponse = new ApiResponse().builder()
                    .message("색칠 성공!")
                    .build();

        return apiResponse;
    }


    public ApiResponse updateArea(ApiRequest apiRequest) {
        Area area = new Area();

        area.updateArea(apiRequest);
        areaRepository.save(area);

        ApiResponse apiResponse = new ApiResponse().builder()
                .message("색칠 성공!")
                .build();

        return apiResponse;
    }
}
