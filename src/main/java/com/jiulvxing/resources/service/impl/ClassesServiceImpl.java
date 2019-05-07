package com.jiulvxing.resources.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jiulvxing.resources.bean.Autodyne;
import com.jiulvxing.resources.bean.Family;
import com.jiulvxing.resources.bean.Live;
import com.jiulvxing.resources.dao.ClassesMapper;
import com.jiulvxing.resources.service.ClassesService;
@Service
public class ClassesServiceImpl implements ClassesService {

	@Autowired
	ClassesMapper classesMapper;
	
	@Override
	public int insertAllAutodyneService(Autodyne autodyne) {
		
		return classesMapper.insertAutodyneByAll(autodyne);
	}

	
	@Override
	public int insertAllFamilyService(Family family) {
		
		return classesMapper.insertFamilyByAll(family);
	}

	
	@Override
	public int insertAllLiveService(Live live) {
		
		return classesMapper.insertLiveByAll(live);
	}

}
