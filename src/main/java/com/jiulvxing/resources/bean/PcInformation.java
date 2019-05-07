package com.jiulvxing.resources.bean;

import java.io.Serializable;

import org.springframework.stereotype.Component;

@Component
public class PcInformation implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int pcId;//ͼƬ���
	private String pcImage;//�����豸
	private String pcSketch;//ͼƬ����
	private String pcAddress;//��ַ
	private String pcPerson;//����
	private String pcTime;//����ʱ��
	private String pcAuthor;//����
	private String pcName;//ͼƬ����	
	//�޲ι��췽��
	public PcInformation() {
		
	}
	public int getPcId() {
		return pcId;
	}
	public void setPcId(int pcId) {
		this.pcId = pcId;
	}
	public String getPcImage() {
		return pcImage;
	}
	public void setPcImage(String pcImage) {
		this.pcImage = pcImage;
	}
	public String getPcSketch() {
		return pcSketch;
	}
	public void setPcSketch(String pcSketch) {
		this.pcSketch = pcSketch;
	}
	public String getPcAddress() {
		return pcAddress;
	}
	public void setPcAddress(String pcAddress) {
		this.pcAddress = pcAddress;
	}
	public String getPcPerson() {
		return pcPerson;
	}
	public void setPcPerson(String pcPerson) {
		this.pcPerson = pcPerson;
	}
	public String getPcTime() {
		return pcTime;
	}
	public void setPcTime(String pcTime) {
		this.pcTime = pcTime;
	}
	public String getPcAuthor() {
		return pcAuthor;
	}
	public void setPcAuthor(String pcAuthor) {
		this.pcAuthor = pcAuthor;
	}
	public String getPcName() {
		return pcName;
	}
	public void setPcName(String pcName) {
		this.pcName = pcName;
	}
	@Override
	public String toString() {
		return "PcInformation [pcId=" + pcId + ", pcImage=" + pcImage + ", pcSketch=" + pcSketch + ", pcAddress="
				+ pcAddress + ", pcPerson=" + pcPerson + ", pcTime=" + pcTime + ", pcAuthor=" + pcAuthor + ", pcName="
				+ pcName + "]";
	}
	public PcInformation(int pcId, String pcImage, String pcSketch, String pcAddress, String pcPerson, String pcTime,
			String pcAuthor, String pcName) {
		super();
		this.pcId = pcId;
		this.pcImage = pcImage;
		this.pcSketch = pcSketch;
		this.pcAddress = pcAddress;
		this.pcPerson = pcPerson;
		this.pcTime = pcTime;
		this.pcAuthor = pcAuthor;
		this.pcName = pcName;
	}
	
	
	
	
	

}
