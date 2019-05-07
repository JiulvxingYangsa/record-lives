package com.jiulvxing.resources.controller;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.jiulvxing.resources.bean.Msg;
import com.jiulvxing.resources.bean.PcInformation;
import com.jiulvxing.resources.bean.PersonalData;
import com.jiulvxing.resources.service.TestServce;
@Controller
public class TestController {

	@Autowired
	TestServce testService;
	@RequestMapping("/getAll")
	@ResponseBody
	public Msg getPcInformationAll(@RequestParam(value="pn",defaultValue="1") Integer pn) {
		 
		 PageHelper.startPage(pn, 2);
		 
		 List<PcInformation> users = testService.selectGetAll();
         PageInfo<PcInformation> page = new PageInfo<PcInformation>(users,5);
		
		 return Msg.success().add("PcInformation", page);
	     }
	@ResponseBody
	@RequestMapping("/getPersonalData")
	public Msg getPersonalDataAll() {
		
		
		PersonalData personalData = testService.selectPersonalDataGetAll();
		return Msg.success().add("PersonalData", personalData);
		
	}
	
	@RequestMapping("/insertByObject")
	public String insertByObject(PcInformation pcInformation , MultipartFile file , HttpServletRequest request){
		if(pcInformation.getPcImage().isEmpty()&&pcInformation.getPcName().isEmpty()&&pcInformation.
				getPcPerson().isEmpty()&&pcInformation.getPcSketch().
				isEmpty()&&pcInformation.getPcTime().isEmpty()&&pcInformation.getPcAddress().isEmpty()) {
			return "fail";
		}else {
		
			System.out.println("打印pcInformation数据："+pcInformation);
			String filePath = request.getSession().getServletContext().getRealPath("/loald");
			String newFileName = fileOperate(file, filePath);
			pcInformation.setPcImage(newFileName);
			System.out.println("打印新的pcInformation数据："+pcInformation);
	        testService.insertByPcInformationService(pcInformation);
			return "success";
		
		}
			
	}
	
	
	
	
	
	

	/**
	 * 
	 * @param file
	 * @param filePath
	 * @return
	 */
	
	
	// 获取文件名并处理文件名，创建文件
	private String fileOperate(MultipartFile file,String filePath) {
		String originalFileName = file.getOriginalFilename();
		System.out.println("原来的文件名"+originalFileName);
		String newFileName = UUID.randomUUID()+originalFileName;  
		System.out.println("新的文件名"+newFileName);
		File targetFile = new File(filePath,newFileName); 
		try {
			file.transferTo(targetFile); 
		} catch (IllegalStateException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}   
		return newFileName;
	}
	
	
	
	
		
	}
	
