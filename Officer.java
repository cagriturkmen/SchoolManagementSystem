package com.marathon.again;

import java.time.LocalDate;

public class Officer extends Employee {
	
	public Officer(Name name, EGender gender, LocalDate birthday, boolean isMarry, LocalDate startDate,
			LocalDate endDate, String hpNo, String mpNo, double firstSalary) {
		super(name, gender, birthday, isMarry, startDate, endDate, hpNo, mpNo, firstSalary);
		// TODO Auto-generated constructor stub
	}
	
	private static final long serialVersionUID = -953472869588151352L;
	
	@Override
	public void setRegistrationNumber() {
		// String regNum = String.format("%03d", Employee.)
	}
	
}
