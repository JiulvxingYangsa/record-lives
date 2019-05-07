package com.jiulvxing.resources.bean;

import java.io.Serializable;

public class PersonalData implements Serializable {

	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int pId;
	 private String pName;
	 private String pBirthday;
	 private String pTag;
	 private int iId;
	 private String pGender;
	 private PcInformation information;
	 
	 public PersonalData() {
			
		}

	 
	public PersonalData(int pId, String pName, String pBirthday, String pTag, int iId, String pGender,
			PcInformation information) {
		super();
		this.pId = pId;
		this.pName = pName;
		this.pBirthday = pBirthday;
		this.pTag = pTag;
		this.iId = iId;
		this.pGender = pGender;
		this.information = information;
	}


	public int getpId() {
		return pId;
	}

	public void setpId(int pId) {
		this.pId = pId;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public String getpBirthday() {
		return pBirthday;
	}

	public void setpBirthday(String pBirthday) {
		this.pBirthday = pBirthday;
	}

	public String getpTag() {
		return pTag;
	}

	public void setpTag(String pTag) {
		this.pTag = pTag;
	}

	public int getiId() {
		return iId;
	}

	public void setiId(int iId) {
		this.iId = iId;
	}

	public String getpGender() {
		return pGender;
	}

	public void setpGender(String pGender) {
		this.pGender = pGender;
	}

	public PcInformation getInformation() {
		return information;
	}

	public void setInformation(PcInformation information) {
		this.information = information;
	}

	@Override
	public String toString() {
		return "PersonalData [pId=" + pId + ", pName=" + pName + ", pBirthday=" + pBirthday + ", pTag=" + pTag
				+ ", iId=" + iId + ", pGender=" + pGender + ", information=" + information + "]";
	}
	 
	
	
	
	
	

}
