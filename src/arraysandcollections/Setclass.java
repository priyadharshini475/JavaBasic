package arraysandcollections;
import java.util.*;
public class Setclass {

	public static void main(String[] args) {
		HashSet<Integer> numlist=new HashSet<>();
        numlist.add(10);
        numlist.add(20);
        numlist.add(30);
        numlist.add(40);
        Iterator<Integer> it1=numlist.iterator();  //Create the iterator
        while(it1.hasNext()) {                     //Access all the elements
        	System.out.print(it1.next()+" ");      
        }System.out.println();
        numlist.add(50);
        TreeSet<String> namelist=new TreeSet<>();
        namelist.add("Priya");
        namelist.add("jeeva");
        namelist.add("abi");
        Iterator<String> it2=namelist.iterator();  //Create the iterator
         System.out.println("Namelist is "+namelist);
         //Using remove method
        boolean value1=numlist.remove(10);
        System.out.println("Is 10 removed - "+value1);
        System.out.println(numlist);
        boolean value2=numlist.removeAll(namelist);
        System.out.println("Is all elements are removed -"+value2);
        System.out.println(numlist);
	}

}
