package com.marathon.again;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Student extends Person {
	
	private static final long serialVersionUID = -4811687491468227782L;
	
	protected static int numOfStudents = 0;
	
	private String registerNumber;
	private LocalDate startDay;
	private LocalDate endDay;
	private long parentNo;
	private ArrayList<Course> takenCourseList;
	
	public Student(Name name, EGender gender, LocalDate birthday, String mpNo, String hpNo, LocalDate startDay,
			long parentNo) {
		super(name, gender, birthday, mpNo, hpNo, false);
		this.setRegisterNumber();
		this.startDay = startDay;
		this.endDay = LocalDate.MAX;
		this.parentNo = parentNo;
		this.takenCourseList = new ArrayList<>();
	}
	
	private void setRegisterNumber() {
		int year = startDay.getYear();
		String regNumber = String.format("%03d", ++Student.numOfStudents);
		this.setRegisterNumber(year + " " + regNumber);
	}
	
	@Override
	public String toString() {
		return "Student [registerNumber=" + registerNumber + ", startDay=" + startDay + ", endDay=" + endDay
				+ ", parentNo=" + parentNo + ", takenCourseList=" + takenCourseList + ", toString()=" + super.toString()
				+ "]";
	}
	
	public String getRegisterNumber() {
		return registerNumber;
	}
	
	public void setRegisterNumber(String registerNumber) {
		this.registerNumber = registerNumber;
	}
	
	public LocalDate getStartDay() {
		return startDay;
	}
	
	public void setStartDay(LocalDate startDay) {
		this.startDay = startDay;
	}
	
	public LocalDate getEndDay() {
		return endDay;
	}
	
	public void setEndDay(LocalDate endDay) {
		this.endDay = endDay;
	}
	
	public long getParentNo() {
		return parentNo;
	}
	
	public void setParentNo(long parentNo) {
		this.parentNo = parentNo;
	}
	
	public List<Course> getTakenCourseList() {
		return takenCourseList;
	}
	
	public void setTakenCourseList(ArrayList<Course> takenCourseList) {
		this.takenCourseList = takenCourseList;
	}
	
}
