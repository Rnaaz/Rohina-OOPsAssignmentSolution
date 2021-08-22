package com.greatlearning.OOPs.department;

public class HrDepartment extends SuperDepartment{
	String departmentName() {
		return "HR Department";
	}
	
	String getTodaysWork() {
		return "Fill today’s worksheet and mark your attendance";
	}
	String getWorkDeadline() {
		return "Complete by EOD";
	}
	String doActivity() {
		return "team Lunch";
	}
}
