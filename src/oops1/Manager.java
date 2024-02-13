package oops1;

public class Manager extends Employee {
  public void bonuses() {
	  System.out.println("Bonus of the manager is 50%");
	  System.out.println("Bonus= "+((0.5)*salary));
  }
  public void project() {
	  System.out.println("Manager work in project-3");
  }
  public Manager(String name,String address,int salary,String jobtitle) {
	  super( name, address,salary, jobtitle);
  }
}
