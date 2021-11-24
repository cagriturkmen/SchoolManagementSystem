package com.marathon.again;

import java.time.LocalDate;

public abstract class Employee extends Person {
	
	private static final long serialVersionUID = 8511141918932281388L;
	protected String registrationNumber;
	private LocalDate startDate;
	private LocalDate endDate;
	private double firstSalary;
	
	public Employee(Name name, EGender gender, LocalDate birthday, boolean isMarry, LocalDate startDate, String hpNo,
			String mpNo, double firstSalary) {
		super(name, gender, birthday, hpNo, mpNo, isMarry);
		this.setRegistrationNumber();
		this.startDate = startDate;
		this.endDate = LocalDate.MAX;
		this.firstSalary = firstSalary;
		
	}
	
	public Employee(Name name, EGender gender, LocalDate birthday, boolean isMarry, LocalDate startDate,
			LocalDate endDate, String hpNo, String mpNo, double firstSalary) {
		super(name, gender, birthday, hpNo, mpNo, isMarry);
		this.setRegistrationNumber();
		this.startDate = startDate;
		this.endDate = endDate;
		this.firstSalary = firstSalary;
	}
	
	@Override
	public String toString() {
		return "Employee [registrationNumber=" + registrationNumber + ", startDate=" + startDate + ", endDate="
				+ endDate + ", firstSalary=" + firstSalary + ", toString()=" + super.toString() + "]";
	}
	
	public abstract void setRegistrationNumber();
	
	public boolean isOldEmployee(LocalDate endDate) {
		return endDate.isBefore(LocalDate.now());
		
	}
	
	public LocalDate getEndDate() {
		return endDate;
	}
	
	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}
	
	public String getRegistrationNumber() {
		return registrationNumber;
	}
	
	public LocalDate getStartDate() {
		return startDate;
	}
	
	public double getFirstSalary() {
		return firstSalary;
	}
	
	public void setRegistrationNumber(String registrationNumber) {
		this.registrationNumber = registrationNumber;
	}
	
	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}
	
	public void setFirstSalary(int firstSalary) {
		this.firstSalary = firstSalary;
	}
	
}
