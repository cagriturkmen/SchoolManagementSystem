package com.marathon.again;

import java.time.LocalDate;

public class Worker extends Employee {
	
	private static final long serialVersionUID = -6696289038366492749L;
	
	public Worker(Name name, EGender gender, LocalDate birthday, boolean isMarry, LocalDate startDate, String hpNo,
			String mpNo, double firstSalary) {
		super(name, gender, birthday, isMarry, startDate, hpNo, mpNo, firstSalary);
	}
	
	@Override
	public String toString() {
		return "Worker [toString()=" + super.toString() + "]";
	}
	
	@Override
	public void setRegistrationNumber() {
		// TODO Auto-generated method stub
		
	}
	
}
