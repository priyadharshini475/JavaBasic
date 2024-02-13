package homework;
import java.util.*;
public class Same_element {

	public static void main(String[] args) {
		HashSet<String> lis1=new HashSet<>();
		HashSet<String> lis2=new HashSet<>();
		lis1.add("Apple");
		lis1.add("Orange");
		lis1.add("mango");
		
		lis2.add("Apple");
		lis2.add("grapes");
		lis2.add("pomegranate");
		lis2.add("mango");
		System.out.println("First list "+lis1);
		System.out.println("Second list "+lis2);
		lis1.retainAll(lis2);
		System.out.println("Common elements "+lis1);

	}

}
