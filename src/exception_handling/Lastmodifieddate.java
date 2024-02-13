package exception_handling;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Scanner;
public class Lastmodifieddate {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
	  File file=new File(s);
      System.out.println("Last modified date is ");
      long time=file.lastModified();
      DateFormat date=new SimpleDateFormat("MMMM dd,yyyy hh:mm a");
      System.out.println(date.format(time));
	}

}
