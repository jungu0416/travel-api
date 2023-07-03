package dev.potatoo.travel.area.service;

import dev.potatoo.travel.area.response.ApiResponseArea;
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

        List<Area> areaList = areaRepository.findAll();

        List<ApiResponseArea> apiResponseArea = areaList.stream()
                                                    .map(area ->
                                                         ApiResponseArea.builder()
                                                                 .area(area)
                                                                 .build()
                                                    )
                                                    .collect(Collectors.toList());

        return apiResponseArea;
    }
}
