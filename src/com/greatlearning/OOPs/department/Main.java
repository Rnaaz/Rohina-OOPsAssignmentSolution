package com.greatlearning.OOPs.department;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AdminDepartment admin = new AdminDepartment();
		HrDepartment hr = new HrDepartment();
		TechDepartment tech = new TechDepartment();
		
		SuperDepartment super_admin = new AdminDepartment();
		SuperDepartment super_hr = new HrDepartment();
		SuperDepartment super_tech = new TechDepartment();
		
		System.out.println("Welcome to "+admin.departmentName());
		System.out.println(admin.getTodaysWork());
		System.out.println((admin.getWorkDeadline()));
		System.out.println(super_admin.isTodayAHoliday());
		System.out.println();
		
		System.out.println("Welcome to "+hr.departmentName());
		System.out.println(hr.doActivity());
		System.out.println(hr.getTodaysWork());
		System.out.println((hr.getWorkDeadline()));
		System.out.println(super_hr.isTodayAHoliday());
		System.out.println();
		
		System.out.println("Welcome to "+tech.departmentName());
		System.out.println(tech.getTodaysWork());
		System.out.println((tech.getWorkDeadline()));
		System.out.println(tech.getTechStackInformation());
		System.out.println(super_tech.isTodayAHoliday());
	}

}
