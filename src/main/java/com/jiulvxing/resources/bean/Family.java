package com.jiulvxing.resources.bean;

import java.io.Serializable;

import org.springframework.stereotype.Component;
@Component
public class Family implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer fId;
	private String fImage;
	private String fSketch;
	private String fAddress;
	private String fPerson;
	private String fTime;
	private String fAuthor;
	private String fName;
	public Integer getfId() {
		return fId;
	}
	public void setfId(Integer fId) {
		this.fId = fId;
	}
	public String getfImage() {
		return fImage;
	}
	public void setfImage(String fImage) {
		this.fImage = fImage;
	}
	public String getfSketch() {
		return fSketch;
	}
	public void setfSketch(String fSketch) {
		this.fSketch = fSketch;
	}
	public String getfAddress() {
		return fAddress;
	}
	public void setfAddress(String fAddress) {
		this.fAddress = fAddress;
	}
	public String getfPerson() {
		return fPerson;
	}
	public void setfPerson(String fPerson) {
		this.fPerson = fPerson;
	}
	public String getfTime() {
		return fTime;
	}
	public void setfTime(String fTime) {
		this.fTime = fTime;
	}
	public String getfAuthor() {
		return fAuthor;
	}
	public void setfAuthor(String fAuthor) {
		this.fAuthor = fAuthor;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public Family() {
		
	}
	public Family(Integer fId, String fImage, String fSketch, String fAddress, String fPerson, String fTime,
			String fAuthor, String fName) {
		super();
		this.fId = fId;
		this.fImage = fImage;
		this.fSketch = fSketch;
		this.fAddress = fAddress;
		this.fPerson = fPerson;
		this.fTime = fTime;
		this.fAuthor = fAuthor;
		this.fName = fName;
	}
	@Override
	public String toString() {
		return "Family [fId=" + fId + ", fImage=" + fImage + ", fSketch=" + fSketch + ", fAddress=" + fAddress
				+ ", fPerson=" + fPerson + ", fTime=" + fTime + ", fAuthor=" + fAuthor + ", fName=" + fName + "]";
	}
	
	
	
}
