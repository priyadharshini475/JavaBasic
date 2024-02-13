package arraysandcollections;
import java.util.ArrayList;
public class Arraylist {

	public static void main(String[] args) {
		ArrayList<String> languages=new ArrayList<>();
		languages.add("Java");
		languages.add("Python");
		languages.add("C++");
		languages.add("C#");
		//print the arraylist
		System.out.println("ArrayList is "+languages);
		//print the list size
		System.out.println("Size is "+languages.size());
		//To read the element
		System.out.println(languages.get(0));
		System.out.println(languages.get(1));
		//To update element
		languages.set(2,"Javascript");
		//To remove the element 
		languages.remove(3);
		System.out.println("After Updation");
		System.out.println("ArrayList "+languages);

	}

}
