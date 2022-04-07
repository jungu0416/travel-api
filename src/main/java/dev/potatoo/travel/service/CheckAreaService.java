package dev.potatoo.travel.service;

import java.util.List;

import org.springframework.stereotype.Service;

import dev.potatoo.travel.model.CheckArea;
import dev.potatoo.travel.repository.CheckAreaMapper;


@Service
public class CheckAreaService {
	CheckAreaMapper checkAreaMapper;
	
	//생성자
	public CheckAreaService(CheckAreaMapper checkAreaMapper) {
		this.checkAreaMapper = checkAreaMapper;
	}
	
	/* 지역 색칠여부 확인 */
	public List<CheckArea> checkArea(){
		return checkAreaMapper.checkArea();
	}
	
}
