package com.jiulvxing.resources.dao;

import java.util.List;

import com.jiulvxing.resources.bean.Autodyne;
import com.jiulvxing.resources.bean.Family;
import com.jiulvxing.resources.bean.Live;

public interface ClassesMapper {

	 int insertAutodyneByAll(Autodyne autodyne);
	 
	 int insertFamilyByAll(Family family);
	
	 int insertLiveByAll(Live live);
	
	 
}
