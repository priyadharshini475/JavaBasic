package oops1;
import java.util.ArrayList;
public class Emp_list {
	ArrayList<Employee> emplist;;
	public Emp_list() {
		System.out.println("Creating Employee list...");
		emplist=new ArrayList<>();
	}
	public void addEmployee(Employee employee) {
		System.out.println("Add Employee to list...");
		emplist.add(employee);
	}
	public ArrayList getEmployees() {
		return emplist;
	}
}
