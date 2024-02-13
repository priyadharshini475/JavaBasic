package exception_handling;

import java.io.File;
import java.util.Scanner;
public class Filesize {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		File file=new File(s);//program files
		System.out.println("Size of the file in Bytes "+sizeBytes(file));
		System.out.println("Size if the file in KiloBytes "+sizeKb(file));
        System.out.println("Size of the file in MegaBytes"+sizeMb(file));
	}
	private static String sizeBytes(File file)   
	{  
	return file.length() + " bytes";  
	}  
	private static String sizeKb(File file)   
	{  
	return ((double) file.length() / 1024) + " kb";  
	} 
	private static String sizeMb(File file)   
	{  
	return ((double) file.length() / (1024 * 1024)) + " mb";  
	}  
	
}
