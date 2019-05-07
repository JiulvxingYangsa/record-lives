package com.jiulvxing.resources.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.jiulvxing.resources.bean.Autodyne;
import com.jiulvxing.resources.bean.Family;
import com.jiulvxing.resources.bean.Live;
import com.jiulvxing.resources.bean.Msg;
import com.jiulvxing.resources.service.ShowPcAllService;

@Controller
@ResponseBody
public class ShowPcAllController {

	@Autowired
	ShowPcAllService showPcAllService;
	
	
	@RequestMapping("/getAutodyneAll")
	public Msg getAutodyneAll(@RequestParam(value="pn",defaultValue="1")Integer pn) {
	  
		PageHelper.startPage(pn,2);
	    List<Autodyne> autodynes = showPcAllService.getAutodyneAll();
		PageInfo<Autodyne> pageInfo =new PageInfo<Autodyne>(autodynes,5);
		return Msg.success().add("autodyne", pageInfo);
	}
	
	
	
	@RequestMapping("/getFamilyAll")
	public Msg getFamily(@RequestParam(value="pn",defaultValue="1") Integer pn) {
		
		PageHelper.startPage(pn, 2);
		List<Family> families = showPcAllService.getFamilyAll();
		PageInfo<Family> pageInfo = new PageInfo<Family>(families,5);		
		return Msg.success().add("family", pageInfo);
		
	}
	
	@RequestMapping("/getLiveAll")
	public Msg getLive(@RequestParam(value="pn",defaultValue="1") Integer pn) {
		PageHelper.startPage(pn,2);
		List<Live> lives = showPcAllService.getLiveAll();
		PageInfo<Live> pageInfo = new PageInfo<Live>(lives,5);
		return Msg.success().add("live", pageInfo);
	}
    	
	
	
}
