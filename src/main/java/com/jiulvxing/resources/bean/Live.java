package com.jiulvxing.resources.bean;

import java.io.Serializable;

import org.springframework.stereotype.Component;
@Component
public class Live implements Serializable {

	private static final long serialVersionUID = 1L;
	private Integer lId;
	private String lImage;
	private String lSketch;
	private String lAddress;
	private String lPerson;
	private String lTime;
	private String lAuthor;
	private String lName;
	
	
	public Live() {
		
	}
	public Integer getlId() {
		return lId;
	}
	public void setlId(Integer lId) {
		this.lId = lId;
	}
	public String getlImage() {
		return lImage;
	}
	public void setlImage(String lImage) {
		this.lImage = lImage;
	}
	public String getlSketch() {
		return lSketch;
	}
	public void setlSketch(String lSketch) {
		this.lSketch = lSketch;
	}
	public String getlAddress() {
		return lAddress;
	}
	public void setlAddress(String lAddress) {
		this.lAddress = lAddress;
	}
	public String getlPerson() {
		return lPerson;
	}
	public void setlPerson(String lPerson) {
		this.lPerson = lPerson;
	}
	public String getlTime() {
		return lTime;
	}
	public void setlTime(String lTime) {
		this.lTime = lTime;
	}
	public String getlAuthor() {
		return lAuthor;
	}
	public void setlAuthor(String lAuthor) {
		this.lAuthor = lAuthor;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public Live(Integer lId, String lImage, String lSketch, String lAddress, String lPerson, String lTime,
			String lAuthor, String lName) {
		super();
		this.lId = lId;
		this.lImage = lImage;
		this.lSketch = lSketch;
		this.lAddress = lAddress;
		this.lPerson = lPerson;
		this.lTime = lTime;
		this.lAuthor = lAuthor;
		this.lName = lName;
	}
	@Override
	public String toString() {
		return "Live [lId=" + lId + ", lImage=" + lImage + ", lSketch=" + lSketch + ", lAddress=" + lAddress
				+ ", lPerson=" + lPerson + ", lTime=" + lTime + ", lAuthor=" + lAuthor + ", lName=" + lName + "]";
	}
	
	
	
}
