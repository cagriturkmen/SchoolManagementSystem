package com.marathon.again;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class School {
	
	private List<Employee> employeeList;
	private HashMap<String, Course> courseList;
	private HashMap<String, Teacher> teacherList;
	private HashMap<String, Student> studentList;
	private List<Employee> oldEmployeeList = new ArrayList<>();
	
	public School() {
		this.employeeList = new ArrayList<>();
		this.teacherList = new HashMap<>();
		this.studentList = new HashMap<>();
		this.courseList = new HashMap<>();
	}
	
	public void addEmployee() {
		
		Officer o1 = new Officer(new Name("Osman", "Tatar"), EGender.MAN, LocalDate.of(1960, Month.APRIL, 20), true,
				LocalDate.of(1990, Month.AUGUST, 01), LocalDate.of(2020, Month.JULY, 30), "0500400400", "0232555555",
				400);
		employeeList.add(o1);
		Officer o2 = new Officer(new Name("Mahmut", "Niyaz"), EGender.MAN, LocalDate.of(1960, Month.JULY, 10), true,
				LocalDate.of(1990, Month.AUGUST, 01), LocalDate.of(2020, Month.JULY, 30), "0500400400", "0232555555",
				400);
		employeeList.add(o2);
		Teacher t1 = new Teacher(new Name("Kadir", "Mert", "İnanır"), EGender.MAN, LocalDate.of(1965, Month.APRIL, 23),
				true, LocalDate.of(1990, Month.AUGUST, 01), "0500400400", "0232555555", 400);
		employeeList.add(t1);
		Teacher t2 = new Teacher(new Name("Kalamar", "Sosis", "Salam"), EGender.MAN,
				LocalDate.of(1970, Month.APRIL, 10), true, LocalDate.of(1999, Month.AUGUST, 30), "0500400400",
				"0232555555", 400);
		employeeList.add(t2);
		
	}
	
	public void addStudent() {
		Student s1 = new Student(new Name("Hakan", "Kara"), EGender.MAN, LocalDate.of(2010, Month.APRIL, 12),
				"050044404004", "04004234234", LocalDate.of(2020, Month.FEBRUARY, 10), 05555555555L);
		studentList.put(s1.getRegisterNumber(), s1);
		Student s2 = new Student(new Name("Ergün", "Kara"), EGender.MAN, LocalDate.of(2010, Month.APRIL, 12),
				"050044404004", "04004234234", LocalDate.of(2020, Month.FEBRUARY, 10), 05555555555L);
		studentList.put(s2.getRegisterNumber(), s2);
		
		Student s3 = new Student(new Name("Arif", "Kara"), EGender.MAN, LocalDate.of(2010, Month.APRIL, 12),
				"050044404004", "04004234234", LocalDate.of(2020, Month.FEBRUARY, 10), 05555555555L);
		studentList.put(s3.getRegisterNumber(), s3);
		
		Student s4 = new Student(new Name("Popescu", "Kara"), EGender.MAN, LocalDate.of(2010, Month.APRIL, 12),
				"050044404004", "04004234234", LocalDate.of(2020, Month.FEBRUARY, 10), 05555555555L);
		studentList.put(s4.getRegisterNumber(), s4);
		
	}
	
	private void newClass() {
		// Course c1 = new Course();
	}
	
	public HashMap<Integer, String> initMenu() {
		HashMap<Integer, String> menu = new HashMap<Integer, String>();
		
		menu.put(1, "NEW_EMPLOYEE");
		menu.put(2, "EMPLOYEE_LIST");
		menu.put(3, "OLD_EMPLOYEES");
		menu.put(4, "NEW_CLASS");
		menu.put(5, "ASSIGN_STUDENTS");
		menu.put(6, "LIST_OF_CLASSES");
		menu.put(7, "CLASSES_OF_STUDENT");
		menu.put(8, "SYSTEM.GIFT_LIST");
		menu.put(9, "SYSTEM.WAGE_LIST");
		menu.put(10, "SYSTEM.EXIT_APPLICATION");
		return menu;
	}
	
	public void processMenu(int selection) {
		
		switch (selection) {
			case 1:
				this.addEmployee();
				break;
			case 2:
				this.employeeList();
				break;
			case 3:
				this.previousEmployeeList(employeeList);
				break;
			case 4:
				this.newClass();
				break;
			case 5:
				// this.assignStudent();
				;
				break;
			case 6:
				// this.studentList();
				break;
			case 7:
				// this.studentsClasses();
				break;
			case 8:
				// this.giftRecipients();
				break;
			case 9:
				// this.salaryInfo();
				break;
			default:
				throw new IllegalArgumentException("Unexpected value: " + selection);
		}
		
	}
	
	private void previousEmployeeList(List<Employee> employeeList) {
		System.out.println("Eski Çalışan Listesi:");
		
		for (Employee employee : employeeList) {
			if (employee.getEndDate().isBefore(LocalDate.now())) {
				oldEmployeeList.add(employee);
			} else {
			}
			
		}
		System.out.println(oldEmployeeList);
	}
	
	private void employeeList() {
		System.out.println(employeeList);
	}
}
