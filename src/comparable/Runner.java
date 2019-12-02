package comparable;

import java.util.ArrayList;
import java.util.Collections;

public class Runner {

	public static void main(String[] args) {

		Employee emp1 = new Employee("Jahangir", 95000, "QA Automation Engineer");
		Employee emp2 = new Employee("Hossain", 115000, "Java developer");
		Employee emp3 = new Employee("Khan", 200000, "QA Manager");
		Employee emp4 = new Employee("Adam", 130000, "Dev oops Engineer");
		Employee emp5 = new Employee("Mike", 150000, "Sr. developer");
		
		ArrayList<Employee> list = new ArrayList<Employee>();
		list.add(emp1);
		list.add(emp2);
		list.add(emp3);
		list.add(emp4);
		list.add(emp5);
		
		Collections.sort(list);
		for(Employee e : list) {
		System.out.println(e);
		}
	}

}
