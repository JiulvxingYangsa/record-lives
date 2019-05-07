package com.jiulvxing.resources.dao;

import java.util.List;

import com.jiulvxing.resources.bean.PcInformation;
import com.jiulvxing.resources.bean.PersonalData;
public interface TestMapper {
	
	public List<PcInformation> selectAll();
	
    public PersonalData selectPersonalDataGetAll();
    
    int insertPcInformation(PcInformation pcInformation);
    
    public  PcInformation selectById(Integer pcId);

}
