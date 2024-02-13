package oops1;
import java.util.ArrayList;
import java.util.Scanner;
public class Employee_driver {
        public static void main(String[] args) {
		Employee m1=new Manager("Priya","Salem",50000,"Senior Manager");
		Employee d1=new Developer("Jayasree","Salem",50000,"Developer");
		Employee p1=new Programmer("Gayatri","Namakkal",45000,"Programmer");
		/*m1.getdetails();
		m1.bonuses();
		m1.project();
		m1.reports();
		d1.getdetails();
		d1.bonuses();
		d1.project();
		d1.reports();
		p1.getdetails();
		p1.bonuses();
		p1.project();
		p1.reports();*/
		Emp_list emp1=new Emp_list();
		emp1.addEmployee(m1);
		emp1.addEmployee(d1);
		emp1.addEmployee(p1);
		ArrayList<Employee> list1=emp1.getEmployees();
		for(Employee e:list1) {
			e.getdetails();
			e.bonuses();
			e.project();
			e.reports();
			System.out.println(" ");
			
		}
        }}
