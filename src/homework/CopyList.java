package homework;
import java.util.*;
public class CopyList {

	public static void main(String[] args) {
	ArrayList<Integer> list1=new ArrayList<>();
	list1.add(10);
	list1.add(20);
	list1.add(30);
	System.out.println("List 1 elements are "+list1);
	ArrayList<Integer> list2=list1;
	System.out.println("List 2 elements are "+list2);
	

	}

}
