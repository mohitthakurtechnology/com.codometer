package com.codometer.interview.problems.wipro;

public class Employee
{
	String empName;
	String empId;
	int salary;
	public static int objectCreatedCount=0;
	Employee(String empName,String empId,int salary)
	{
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
		objectCreatedCount++;
	}
}
