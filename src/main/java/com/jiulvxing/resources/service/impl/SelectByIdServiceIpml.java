package com.jiulvxing.resources.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jiulvxing.resources.bean.PcInformation;
import com.jiulvxing.resources.dao.TestMapper;
import com.jiulvxing.resources.service.SelectByIdService;
@Service
public class SelectByIdServiceIpml implements SelectByIdService {

	@Autowired
	TestMapper testMapper;
	
	@Override
	public PcInformation getPcInformationById(Integer pcId) {
		
		return testMapper.selectById(pcId);
	}

}
