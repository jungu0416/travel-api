package dev.potatoo.travel.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import dev.potatoo.travel.model.CheckArea;

@Mapper
public interface CheckAreaMapper {
	
	List<CheckArea> checkArea();
	
	
	
}
