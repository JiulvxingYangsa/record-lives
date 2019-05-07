package com.jiulvxing.resources.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jiulvxing.resources.bean.Autodyne;
import com.jiulvxing.resources.bean.Family;
import com.jiulvxing.resources.bean.Live;
import com.jiulvxing.resources.dao.ShowPcAllMapper;
import com.jiulvxing.resources.service.ShowPcAllService;
@Service
public class ShowPcAllServiceImpl implements ShowPcAllService {

	@Autowired
	ShowPcAllMapper showAllMapper;
	
	
	@Override
	public List<Autodyne> getAutodyneAll() {

		return showAllMapper.selectAutodyneAll();
	}

	@Override
	public List<Family> getFamilyAll() {


		return showAllMapper.selectFamilyAll();
	}

	@Override
	public List<Live> getLiveAll() {


		return showAllMapper.selectLiveAll();
	}

}
