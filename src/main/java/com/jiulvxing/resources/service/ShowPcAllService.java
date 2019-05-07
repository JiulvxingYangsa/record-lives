package com.jiulvxing.resources.service;

import java.util.List;

import com.jiulvxing.resources.bean.Autodyne;
import com.jiulvxing.resources.bean.Family;
import com.jiulvxing.resources.bean.Live;

public interface ShowPcAllService {

	public List<Autodyne> getAutodyneAll();
	
	public List<Family> getFamilyAll();
	
	public List<Live> getLiveAll();
	
	
	
}
