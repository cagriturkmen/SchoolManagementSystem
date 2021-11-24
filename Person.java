package com.marathon.again;

import java.io.Serializable;
import java.time.LocalDate;

public class Person implements Serializable {
	
	private static final long serialVersionUID = -904249015604998652L;
	private Name name;
	private EGender gender;
	private LocalDate birthday;
	private String mpNo;
	private String hpNo;
	private boolean isMarry;
	
	public Person(Name name, EGender gender, LocalDate birthday, String mpNo, String hpNo, boolean isMarry) {
		super();
		this.name = name;
		this.gender = gender;
		this.birthday = birthday;
		this.mpNo = mpNo;
		this.hpNo = hpNo;
		this.isMarry = isMarry;
	}
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", gender=" + gender + ", birthday=" + birthday + ", mpNo=" + mpNo + ", hpNo="
				+ hpNo + ", isMarry=" + isMarry + "]";
	}
	
	public Name getName() {
		return name;
	}
	
	public void setName(Name name) {
		this.name = name;
	}
	
	public String getMpNo() {
		return mpNo;
	}
	
	public void setMpNo(String mpNo) {
		this.mpNo = mpNo;
	}
	
	public String getHpNo() {
		return hpNo;
	}
	
	public void setHpNo(String hpNo) {
		this.hpNo = hpNo;
	}
	
	public boolean isMarry() {
		return isMarry;
	}
	
	public void setMarry(boolean isMarry) {
		this.isMarry = isMarry;
	}
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	public EGender getGender() {
		return gender;
	}
	
	public LocalDate getBirthday() {
		return birthday;
	}
	
}
