package homework;
import java.util.*;
public class Mapvalue_find {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		HashMap<Integer,String> map1=new HashMap<>();
		map1.put(1,"apple");
		map1.put(2,"mango");
		map1.put(3,"orange");
		map1.put(4, "pineapple");
		map1.put(5,"pomegranate");
		System.out.println("Enter the key to get the value");
		int n=sc.nextInt();
		int count=0;
        for(int a:map1.keySet()) {
        	if(a==n) {
        		System.out.println("value:"+map1.get(a));
        		count++;}
        }
        if(count==0)
        	System.out.println("No match found");
	}

}
