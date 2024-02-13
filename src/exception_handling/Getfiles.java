package exception_handling;

import java.io.File;
import java.util.Scanner;
public class Getfiles {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		File file=new File(s);
	   File arr[]=file.listFiles();
		String input_ex=sc.nextLine();
		int count=0;
		for(int i=0;i<arr.length;i++) {
			String s1=arr[i].getName();
			if(s1.contains(input_ex)) {
				 System.out.println(s1);
				 count++;}
		}if(count==0)
			System.out.println("No match found");
		

	}

}
