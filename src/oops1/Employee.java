package oops1;

public abstract class Employee {
      String name;
      String address;
      int salary;
      String jobtitle;
      public Employee(String name,String address,int salary,String jobtitle) {
    	  this.name=name;
    	  this.address=address;
    	  this.salary=salary;
    	  this.jobtitle=jobtitle;
      }
      public void getdetails() {
    	  System.out.println(name+"-"+address+"-"+salary+"-"+jobtitle);
      }
      public abstract void bonuses();
      public void reports() {
    	  System.out.println("Report of the Employee is ...");
      }
      public abstract void project();
}
