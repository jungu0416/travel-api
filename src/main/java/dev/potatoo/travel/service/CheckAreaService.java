package dev.potatoo.travel.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.potatoo.travel.dao.CheckAreaDao;

@Service
public class CheckAreaService {
	@Autowired
	CheckAreaDao checkAreaDao;

	
	
}
