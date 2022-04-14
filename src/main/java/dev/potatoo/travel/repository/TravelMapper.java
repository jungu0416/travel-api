package dev.potatoo.travel.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import dev.potatoo.travel.model.CheckArea;
import dev.potatoo.travel.model.Location;

@Mapper
public interface TravelMapper {
	
	/* 색칠된 지역 찾기 */
	List<CheckArea> checkArea();
	
	/* 지역 색칠 DB에 없다면 insert */
	int updateArea(Location location);
	
}
