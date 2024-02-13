package exception_handling;

import java.io.File;
import java.util.Scanner;
public class ReadWrite_Permission {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		File file=new File(s);
		if(file.canRead()) 
			 System.out.println("It is readable file");
		else
			System.out.println("It is not readable file");
		if(file.canWrite())
			System.out.println("It is writable file");
		else
			System.out.println("It is not a readable file");
	}
}
	


