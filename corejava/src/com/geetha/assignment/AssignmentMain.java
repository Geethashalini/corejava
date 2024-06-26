package com.geetha.assignment;
import com.geetha.assignment.employees.Developer; 
import com.geetha.assignment.employees.Manager; 
import com.geetha.assignment.utilities.EmployeeUtilities;
public class AssignmentMain {
	public static void main(String[] args) { 
		 Manager manager = new Manager("Hitesh", 101, 90000, "IT"); 
		 Developer developer = new Developer("Geetha", 102, 80000, "Java"); 
		 // Using EmployeeUtilities to perform operations 
		 EmployeeUtilities.displayEmployeeDetails(manager); 
		 EmployeeUtilities.displayEmployeeDetails(developer); 
		 double managerAnnualSalary = 
		EmployeeUtilities.calculateAnnualSalary(manager); 
		 double developerAnnualSalary = 
		EmployeeUtilities.calculateAnnualSalary(developer); 
		 System.out.println("Manager Annual Salary: " + 
		managerAnnualSalary); 
		 System.out.println("Developer Annual Salary: " + 
		developerAnnualSalary); 
		 } 
		} 
}

