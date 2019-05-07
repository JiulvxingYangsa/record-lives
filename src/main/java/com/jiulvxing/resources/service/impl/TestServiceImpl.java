package com.jiulvxing.resources.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jiulvxing.resources.bean.PcInformation;
import com.jiulvxing.resources.bean.PersonalData;
import com.jiulvxing.resources.dao.TestMapper;
import com.jiulvxing.resources.service.TestServce;
@Service
public class TestServiceImpl implements TestServce {

	@Autowired
	TestMapper testMapper;
	
	
	@Override
	public List<PcInformation> selectGetAll() {
		
		return testMapper.selectAll();
	}


	@Override
	public PersonalData selectPersonalDataGetAll() {
		
		return testMapper.selectPersonalDataGetAll();
	}


	@Override
	public int insertByPcInformationService(PcInformation pcInformation) {
		
		
		return testMapper.insertPcInformation(pcInformation);
	}

}