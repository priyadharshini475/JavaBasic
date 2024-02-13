package oops;

public abstract class Student {
	 String name;
	String address;
	float gpa;
	private double average; //private variable
	public static final String college="MEC";  // Final it is common for all the instances in the class and static it is attached
	public Student() {                         // to the class level...
		
	}
	public Student(String strname) {
	  name=strname;
	}
	public void set(double a,double b) {
		average=(a+b)/2;
	}
	public double get() {
		return average;
	}
	/*public void gotoclass() {
		
	}*/
	public abstract void gotoclass();
	public final double getcgpa() {
		return 9.5;
	}
	public void gotoclass(String direction) {
		
	}
	

}
