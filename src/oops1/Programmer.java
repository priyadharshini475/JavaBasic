package oops1;

public class Programmer extends Employee {
	 public void bonuses() {
		  System.out.println("Bonus of the Programmer is 20%");
		  System.out.println("Bonus= "+((0.5)*salary));
	  }
	  public void project() {
		  System.out.println("Programmer invlove in project-2");
	  }
	  public Programmer(String name,String address,int salary,String jobtitle) {
		  super( name, address,salary, jobtitle);
	  }
}
