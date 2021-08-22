package com.greatlearning.OOPs.department;

public class TechDepartment extends SuperDepartment{
	String departmentName() {
		return "Tech Department";
	}
	
	String getTodaysWork() {
		return "Complete coding of Module 1";
	}
	String getWorkDeadline() {
		return "Complete by EOD";
	}
	String getTechStackInformation() {
		return "Core Java";
	}
}
