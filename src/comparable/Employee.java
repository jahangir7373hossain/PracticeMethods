package comparable;

public class Employee implements Comparable<Employee>{

	
	String name;
	int salary;
	String dep;
	
	
	
	public String toString() {
		return "Empoyee [name=" + name + ", salary=" + salary + ", dep=" + dep + "]";
	}


	public Employee(String name, int salary, String dep) {
		this.name = name;
		this.salary = salary;
		this.dep = dep;
	}
	
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
		
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getDep() {
		return dep;
	}
	public void setDep(String dep) {
		this.dep = dep;
	}


	@Override
	public int compareTo(Employee o) {
		return this.name.compareTo(o.getName());
	}
}
