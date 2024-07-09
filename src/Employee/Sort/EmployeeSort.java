package Employee.Sort;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class EmployeeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Employee> al = new ArrayList<Employee>();
		al.add(new Employee(1, "sainath", 25000.0, "IT", 32));
		al.add(new Employee(2, "saritha", 35000.0, "IT", 25));
		al.add(new Employee(3, "prasad", 26000.0, "CSE", 28));
		al.add(new Employee(4, "harika", 20000.0, "CSE", 26));
		al.add(new Employee(5, "shiva", 35000.0, "MECH", 36));
		al.add(new Employee(6, "devi", 21000.0, "MECH", 38));
		al.add(new Employee(7, "saisha", 39000.0, "ECE", 32));
		al.add(new Employee(8, "shyam", 31000.0, "ECE", 30));

		// gouping based on department
		Map<String, List<Employee>> collect = al.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment, Collectors.toList()));
	//	System.out.println(collect);
		
		//youngest person in each department
	Map<String, Optional<Employee>> collect2 = al.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.minBy(Comparator.comparing(Employee::getAge))));
	//System.out.println(collect2);
	
	//adding 10% for department IT
	List<Double> collect3 = al.stream().filter(a->a.getDepartment().equals("IT")).collect(Collectors.mapping(a->a.getSalary()*1.2, Collectors.toList()));
	//System.out.println(collect3);
	
	List<Entry<String, List<Employee>>> collect4 = al.stream().collect(Collectors.groupingBy(Employee::getDepartment)).entrySet().stream().filter(a->a.getKey().equals("IT")).collect(Collectors.toList());
	//System.out.println(collect4);
	
	 al.stream()
     .filter(employee -> "IT".equals(employee.getDepartment()))
     .forEach(employee -> employee.setSalary(employee.getSalary() * 1.10));

  // al.forEach(System.out::println);
   al.stream().filter(a->a.getDepartment().equals("IT")).forEach(a->a.setSalary(a.getSalary()*1.10));
   al.forEach(System.out::println);
   
   //highest salary in each dept
   Map<String, Optional<Employee>> collect5 = al.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.maxBy(Comparator.comparing(Employee::getSalary))));
	System.out.println(collect5);
	
	//highest salary
	Optional<Employee> collect6 = al.stream().collect(Collectors.maxBy(Comparator.comparing(Employee::getSalary)));
	System.out.println("collect6  "+collect6);

	//second highest salary
	Double double1 = al.stream().map(a->a.getSalary()).sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
	System.out.println(double1);
	
	//al.stream().map(aa->aa).filter(aa->aa.getSalary()>30000).forEach(System.out::println);
	
	al.stream().forEach(System.out::println);
	
	}

}
