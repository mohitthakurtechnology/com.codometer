package com.codometer.interview.problems.wipro;

import java.util.*;

/*
 * interview dated at 1/9/2025
 * create an employee class with emp id , name ,salary ,create 10 object , print number of objects created
 * should be sorted print in following manner
 */

public class Create_Employee_Class_Print_Number_Of_Objects_Created {

	public static void main(String[] args) {
		
		int numberOfEmployeeToBeCreated,salary;
		String empName, empId;
	
		ArrayList<Employee> employeeList = new ArrayList<>();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the number of  employee you would like to create");
		numberOfEmployeeToBeCreated = sc.nextInt();
		
		for(int i = 0;i < numberOfEmployeeToBeCreated; i++)
		{
			System.out.println("Please enter employee " + (i+1) + " id");
			empId = sc.next();
			System.out.println("Please enter employee " + (i+1) + " name");
			empName = sc.next();
			System.out.println("Please enter employee " + (i+1) + " salary");
			salary = sc.nextInt();
			employeeList.add(new Employee(empName,empId,salary));
		}
		for(int i = 0;i < employeeList.size();i++)
		{
			System.out.println("employeeId is => " + employeeList.get(i).empId);
			System.out.println("employeeName is => " + employeeList.get(i).empName);
			System.out.println("employeeSalary is => " + employeeList.get(i).salary);
		}
		System.out.println("Count Of Object Created is " + Employee.objectCreatedCount);
	}

}
