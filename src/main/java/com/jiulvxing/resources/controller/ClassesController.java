package com.jiulvxing.resources.controller;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.jiulvxing.resources.bean.Autodyne;
import com.jiulvxing.resources.bean.Family;
import com.jiulvxing.resources.bean.Live;
import com.jiulvxing.resources.service.ClassesService;
@Controller
public class ClassesController {
	
	
	@Autowired
	ClassesService classesService;

	@RequestMapping("/insertAutodyne")
	public String insertAutodyne(Autodyne autodyne , MultipartFile file , HttpServletRequest request){
		if(autodyne.getaImage().isEmpty()&&autodyne.getaName().isEmpty()&&autodyne.
				getaPerson().isEmpty()&&autodyne.getaSketch().
				isEmpty()&&autodyne.getaTime().isEmpty()&&autodyne.getaAddress().isEmpty()) {
			return "fail";
		}else {
		
			System.out.println("��ӡpcInformation���ݣ�"+autodyne);
			String filePath = request.getSession().getServletContext().getRealPath("/loald");
			String newFileName = fileOperate(file, filePath);
			autodyne.setaImage(newFileName);
			System.out.println("��ӡ�µ�pcInformation���ݣ�"+autodyne);
	        classesService.insertAllAutodyneService(autodyne);
			return "success";
		
		}
	}
		
		@RequestMapping("/insertFamily")
		public String insertFamily(Family family , MultipartFile file , HttpServletRequest request){
			if(family.getfImage().isEmpty()&&family.getfName().isEmpty()&&family.
					getfPerson().isEmpty()&&family.getfSketch().
					isEmpty()&&family.getfTime().isEmpty()&&family.getfAddress().isEmpty()) {
				return "fail";
			}else {
			
				System.out.println("��ӡpcInformation���ݣ�"+family);
				String filePath = request.getSession().getServletContext().getRealPath("/loald");
				String newFileName = fileOperate(file, filePath);
				family.setfImage(newFileName);
				System.out.println("��ӡ�µ�pcInformation���ݣ�"+family);
		        classesService.insertAllFamilyService(family);
				return "success";
			
			}
		}
			
			@RequestMapping("/insertLive")
			public String insertLive(Live live , MultipartFile file , HttpServletRequest request){
				if(live.getlImage().isEmpty()&&live.getlName().isEmpty()&&live.
						getlPerson().isEmpty()&&live.getlSketch().
						isEmpty()&&live.getlTime().isEmpty()&&live.getlAddress().isEmpty()) {
					return "fail";
				}else {
				
					System.out.println("��ӡpcInformation���ݣ�"+live);
					String filePath = request.getSession().getServletContext().getRealPath("/loald");
					String newFileName = fileOperate(file, filePath);
					live.setlImage(newFileName);
					System.out.println("��ӡ�µ�pcInformation���ݣ�"+live);
                    classesService.insertAllLiveService(live);
					return "success";
				
				}
			}	
				
				
				/**
				 * 
				 * @param file
				 * @param filePath
				 * @return
				 */
				
				
				// ��ȡ�ļ����������ļ����������ļ�
				private String fileOperate(MultipartFile file,String filePath) {
					String originalFileName = file.getOriginalFilename();
					System.out.println("ԭ�����ļ���"+originalFileName);
					String newFileName = UUID.randomUUID()+originalFileName;  
					System.out.println("�µ��ļ���"+newFileName);
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
