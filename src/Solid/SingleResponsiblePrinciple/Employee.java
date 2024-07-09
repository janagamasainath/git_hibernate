package Solid.SingleResponsiblePrinciple;

public class Employee {
	
	// calcuate the salary
	public int calculateSalary() {
		return 10000;
		
	}
	
	// getting the department details
	public String getDepartment() {
		return "it";	
		}

	//saving employee details in the DB
	public void saveEmployee() {
		
		}

}
// Note : in the employee class as doing the 3 jobs i,e.. "calculateSalary","getDepartment","saveEmployee"
// single Responsible Principle means which mean should do only one job so we need to divide the task
// A class should have only one reason to change, meaning it should only have one job or responsibility.