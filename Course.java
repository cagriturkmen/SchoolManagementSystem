package com.marathon.again;

import java.io.Serializable;
import java.time.DayOfWeek;
import java.util.List;

public class Course implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2696036696290896895L;
	private Teacher mainTeacher;
	private Teacher secondaryTeacher;
	private String courseName;
	private int courseYear;
	private int courseHours;
	private DayOfWeek day;
	private List<Student> studentList;
	
	public Course(Teacher mainTeacher, Teacher secondaryTeacher, String courseName, int courseYear, int courseHours,
			DayOfWeek day, List<Student> studentList) {
		super();
		this.mainTeacher = mainTeacher;
		this.secondaryTeacher = secondaryTeacher;
		this.courseName = courseName;
		this.courseYear = courseYear;
		this.courseHours = courseHours;
		this.day = day;
		this.studentList = studentList;
	}
	
	public Course(Teacher mainTeacher, Teacher secondaryTeacher, List<Student> studentList) {
		super();
		this.mainTeacher = mainTeacher;
		this.secondaryTeacher = secondaryTeacher;
		this.studentList = studentList;
	}
	
	@Override
	public String toString() {
		return "Course [mainTeacher=" + mainTeacher + ", secondaryTeacher=" + secondaryTeacher + ", courseName="
				+ courseName + ", courseYear=" + courseYear + ", courseHours=" + courseHours + ", day=" + day
				+ ", studentList=" + studentList + "]";
	}
	
	public Teacher getMainTeacher() {
		return mainTeacher;
	}
	
	public void setMainTeacher(Teacher mainTeacher) {
		this.mainTeacher = mainTeacher;
	}
	
	public Teacher getSecondaryTeacher() {
		return secondaryTeacher;
	}
	
	public void setSecondaryTeacher(Teacher secondaryTeacher) {
		this.secondaryTeacher = secondaryTeacher;
	}
	
	public String getCourseName() {
		return courseName;
	}
	
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	
	public int getCourseYear() {
		return courseYear;
	}
	
	public void setCourseYear(int courseYear) {
		this.courseYear = courseYear;
	}
	
	public int getCourseHours() {
		return courseHours;
	}
	
	public void setCourseHours(int courseHours) {
		this.courseHours = courseHours;
	}
	
	public DayOfWeek getDay() {
		return day;
	}
	
	public void setDay(DayOfWeek day) {
		this.day = day;
	}
	
	public List<Student> getStudentList() {
		return studentList;
	}
	
	public void setStudentList(List<Student> studentList) {
		this.studentList = studentList;
	}
	
}
