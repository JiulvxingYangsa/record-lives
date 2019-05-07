package com.jiulvxing.resources.bean;

import java.io.Serializable;

import org.springframework.stereotype.Component;
@Component
public class Autodyne implements Serializable {
   
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer aId;
	private String aImage;
	private String aSketch;
	private String aAddress;
	private String aPerson;
	private String aTime;
	private String aAuthor;
	private String aName;
	public Integer getaId() {
		return aId;
	}
	public void setaId(Integer aId) {
		this.aId = aId;
	}
	public String getaImage() {
		return aImage;
	}
	public void setaImage(String aImage) {
		this.aImage = aImage;
	}
	public String getaSketch() {
		return aSketch;
	}
	public void setaSketch(String aSketch) {
		this.aSketch = aSketch;
	}
	public String getaAddress() {
		return aAddress;
	}
	public void setaAddress(String aAddress) {
		this.aAddress = aAddress;
	}
	public String getaPerson() {
		return aPerson;
	}
	public void setaPerson(String aPerson) {
		this.aPerson = aPerson;
	}
	public String getaTime() {
		return aTime;
	}
	public void setaTime(String aTime) {
		this.aTime = aTime;
	}
	public String getaAuthor() {
		return aAuthor;
	}
	public void setaAuthor(String aAuthor) {
		this.aAuthor = aAuthor;
	}
	public String getaName() {
		return aName;
	}
	public void setaName(String aName) {
		this.aName = aName;
	}
	public Autodyne() {
		
	}
	public Autodyne(Integer aId, String aImage, String aSketch, String aAddress, String aPerson, String aTime,
			String aAuthor, String aName) {
		super();
		this.aId = aId;
		this.aImage = aImage;
		this.aSketch = aSketch;
		this.aAddress = aAddress;
		this.aPerson = aPerson;
		this.aTime = aTime;
		this.aAuthor = aAuthor;
		this.aName = aName;
	}
	@Override
	public String toString() {
		return "Autodyne [aId=" + aId + ", aImage=" + aImage + ", aSketch=" + aSketch + ", aAddress=" + aAddress
				+ ", aPerson=" + aPerson + ", aTime=" + aTime + ", aAuthor=" + aAuthor + ", aName=" + aName + "]";
	}
	
	
	
}
