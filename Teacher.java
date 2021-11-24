package com.marathon.again;

import java.time.LocalDate;

public class Teacher extends Employee {
	
	private static final long serialVersionUID = -7846899043450373417L;
	Course course;
	
	public Teacher(Name name, EGender gender, LocalDate birthday, boolean isMarry, LocalDate startDate, String hpNo,
			String mpNo, double firstSalary) {
		super(name, gender, birthday, isMarry, startDate, hpNo, mpNo, firstSalary);
	}
	
	@Override
	public String toString() {
		return "Teacher [course=" + course + ", toString()=" + super.toString() + "]";
	}
	
	public Course getCourse() {
		return course;
	}
	
	public void setCourse(Course course) {
		this.course = course;
	}
	
	@Override
	public void setRegistrationNumber() {
		// TODO Auto-generated method stub
		
	}
	
}
