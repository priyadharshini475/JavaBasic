package homework;
import java.util.*;
public class Reverse_elements {

	public static void main(String[] args) {
	ArrayList<String> l1=new ArrayList<>();
	l1.add("Priya");
	l1.add("mano");
	l1.add("sineka");
	l1.add("suvetha");
	System.out.println("List 1 elements are "+l1);
	System.out.println("Reverse list elements are "+reverse(l1));
	}
	public static ArrayList<String> reverse(ArrayList<String> lis) {
		ArrayList<String> lis1=new ArrayList<>();
		for(int i=lis.size()-1;i>=0;i--) {
			lis1.add(lis.get(i));
		}
		return lis1;
	}
	

}
