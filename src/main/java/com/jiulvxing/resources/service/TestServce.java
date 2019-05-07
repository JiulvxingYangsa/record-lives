package com.jiulvxing.resources.service;

import java.util.List;

import com.jiulvxing.resources.bean.PcInformation;
import com.jiulvxing.resources.bean.PersonalData;

public interface TestServce {

	   public List<PcInformation> selectGetAll();
	   
	   public PersonalData selectPersonalDataGetAll();
	   
	   public int insertByPcInformationService(PcInformation pcInformation);
	
}
