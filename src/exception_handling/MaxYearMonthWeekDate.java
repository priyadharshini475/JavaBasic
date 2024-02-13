package exception_handling;
import java.util.Calendar;
public class MaxYearMonthWeekDate {

	public static void main(String[] args) {
		Calendar cal1=Calendar.getInstance();
		System.out.println("Current time is: "+cal1.getTime());
		System.out.println("Max Year is "+cal1.getActualMaximum(Calendar.YEAR));
		System.out.println("Max Month is "+cal1.getActualMaximum(Calendar.MONTH));
		System.out.println("Max Week is "+cal1.getActualMaximum(Calendar.WEEK_OF_YEAR));
		System.out.println("Max Date is "+cal1.getActualMaximum(Calendar.DATE));
	}

}
