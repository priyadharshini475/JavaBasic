package oops;
import java.util.ArrayList;
public class Student_driver {

	public static void main(String[] args) {
		/*Student s1=new Student("John");
	    s1.address="Coimbatore";
	    s1.gpa=8.9f;
	    Student s2=new Student("Chris");
	    s2.address="Chennai";
	    s2.gpa=9.1f;
	    Student s3=new Student("Peter");
	    s3.address="Salem";
	    s3.gpa=8.7f;
	    System.out.println("Student1 details: "+s1.name+" "+s1.address+" "+s1.gpa);
	    System.out.println("Student2 details: "+s2.name+" "+s2.address+" "+s2.gpa);
	    System.out.println("Student3 details: "+s3.name+" "+s3.address+" "+s3.gpa);*/
	    Student mstd1=new MNC_Student("Priya");
	    mstd1.gpa=8.9f;
	    Student paystd1=new Pay_Student("mano");
	    paystd1.gpa=9.1f;
	    Student audstd1=new AuditStudent("sineka");
	    audstd1.gpa=9.1f;
	    mstd1.set(50.0,60.0);
	    System.out.println("The average of mstd1 is");
	    System.out.println(mstd1.get());
	    MNC_Student mstd2=new MNC_Student("Jeeva");
	    System.out.println("Attendance and Score");
	    System.out.println(mstd2.getattendance());   // Interface checking
	    System.out.println(mstd2.getScore());
	  //  mstd1.gotoclass();
	  //  paystd1.gotoclass();
	    Studentlist std=new Studentlist();
	    std.addStudent(mstd1);
	    std.addStudent(paystd1);
	    std.addStudent(audstd1);
	    ArrayList<Student> list1=std.getStudents();
	    for(Student stu:list1) {
	    	stu.gotoclass();
	    	stu.gotoclass("East");
	    	System.out.println(stu.college);
	    	System.out.println(stu.getcgpa());
	    }
	    
	    
	}

}
