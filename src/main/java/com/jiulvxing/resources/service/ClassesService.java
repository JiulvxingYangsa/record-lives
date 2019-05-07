package com.jiulvxing.resources.service;

import com.jiulvxing.resources.bean.Autodyne;
import com.jiulvxing.resources.bean.Family;
import com.jiulvxing.resources.bean.Live;

public interface ClassesService {

	int insertAllAutodyneService(Autodyne autodyne);
	
	int insertAllFamilyService(Family family);
	
	int insertAllLiveService(Live live);
	
}
