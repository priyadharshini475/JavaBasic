package oops;
import java.util.ArrayList;
public class Studentlist {
	ArrayList<Student> stulist;;
	public Studentlist() {
		System.out.println("Creating student list...");
		stulist=new ArrayList<>();
	}
	public void addStudent(Student student) {
		System.out.println("Add Student to list...");
		stulist.add(student);
	}
	public ArrayList getStudents() {
		return stulist;
	}
	

}
