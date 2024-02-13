package exception_handling;
import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
public class StringToDate {

	public static void main(String[] args) throws ParseException {
      Scanner sc=new Scanner(System.in);
      String s1=sc.nextLine();
      Date date=new SimpleDateFormat("dd/MM/yyyy").parse(s1);
      System.out.println("The date is "+date);
      

	}

}
