package arraysandcollections;
import java.util.*;
public class Mapclass {

	public static void main(String[] args) {
		HashMap<Integer,String> langlist=new HashMap<>();
		langlist.put(1, "Java");
		langlist.put(2, "Python");
		langlist.put(3, "Javascript");
		langlist.put(4, "c++");
		System.out.println("Languages are "+langlist);
		System.out.println(langlist.keySet());
		System.out.println(langlist.values());
		//Get the value by using  key values
		System.out.println(langlist.get(2));
		for(int a:langlist.keySet()) {
			System.out.print(a+"-"+langlist.get(a)+" ");
		}System.out.println();
		//EntrySet
		System.out.println("Key-value mappings: "+langlist.entrySet());
		//Remove element from the map using key 
		String s1=langlist.remove(2);
		System.out.println("Removed value: "+s1);
		
		
		

	}

}
