package com.geetha.assignment.utilities;

	import com.geetha.assignment.employees.Employee; 
	/** 
	 * Utility class for performing operations on Employee objects. 
	 */ 
	public class EmployeeUtilities { 
	 /** 
	 * Calculates the annual salary of an employee. 
	 * @param employee the employee whose annual salary is to be calculated 
	 * @return the annual salary 
	 */ 
	 public static double calculateAnnualSalary(Employee employee) { 
	 return employee.getSalary() * 12; 
	 } 
	 /** 
	 * Displays the details of an employee. 
	 * @param employee the employee whose details are to be displayed 
	 */ 
	 public static void displayEmployeeDetails(Employee employee) { 
	 System.out.println("Name: " + employee.getName()); 
	 System.out.println("Employee ID: " + employee.getEmployeeId()); 
	 System.out.println("Salary: " + employee.getSalary()); 
	 } 
	} 



