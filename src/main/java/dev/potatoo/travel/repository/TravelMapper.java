package dev.potatoo.travel.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import dev.potatoo.travel.model.CheckArea;

@Mapper
public interface TravelMapper {
	
	/* 색칠된 지역 찾기 */
	List<CheckArea> checkArea();
	
	/* 해당 지역 삽입*/
	int insertArea(List<String> location);
	
	/* 지역 색칠 Y */
	int updateAreaY(String location);
	
	/* 지역 색칠 N*/
	int updateAreaN(String location);
	
}
