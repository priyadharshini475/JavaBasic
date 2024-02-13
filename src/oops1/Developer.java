package oops1;

public class Developer extends Employee{
	 public void bonuses() {
		  System.out.println("Bonus of the developer is 25%");
		  System.out.println("Bonus= "+((0.5)*salary));
	  }
	  public void project() {
		  System.out.println("Developer work in developing project-1");
	  }
	  public Developer(String name,String address,int salary,String jobtitle) {
		  super( name, address,salary, jobtitle);
	  }
}
