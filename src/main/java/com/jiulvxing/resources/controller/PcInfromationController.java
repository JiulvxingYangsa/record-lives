package com.jiulvxing.resources.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jiulvxing.resources.bean.Msg;
import com.jiulvxing.resources.bean.PcInformation;
import com.jiulvxing.resources.service.SelectByIdService;

@Controller
public class PcInfromationController {

	@Autowired
	SelectByIdService selectByIdService;
	
	@ResponseBody
	@RequestMapping("/getPcInfromationById")
	public Msg getPcInfromationById(@RequestParam("pcId")Integer pcId) {
		
		PcInformation information =  selectByIdService.getPcInformationById(pcId);
		System.out.println(information);
		return Msg.success().add("PcInfromation",information);
	}
	
}
