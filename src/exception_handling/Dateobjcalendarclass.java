package exception_handling;
import java.util.Calendar;
import java.util.Scanner;
public class Dateobjcalendarclass {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Calendar cal1=Calendar.getInstance();
		int year=sc.nextInt();          //0-Jan to 11-Dec
		cal1.set(Calendar.YEAR,year);
		int month=sc.nextInt();
		cal1.set(Calendar.MONTH, month);
		int date=sc.nextInt();
		cal1.set(Calendar.DATE,date);
         System.out.println(cal1.getTime());
	}

}
