package exception_handling;
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;
public class DiffBetweenTwoDates {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first date (YYYY-MM-DD): ");
        String inputDate1 = sc.nextLine();
        System.out.print("Enter the second date (YYYY-MM-DD): ");
        String inputDate2 = sc.nextLine();
        LocalDate date1 = LocalDate.parse(inputDate1);
        LocalDate date2 = LocalDate.parse(inputDate2);
        Period period = Period.between(date1, date2);
        System.out.println("Difference between the two dates are:");
        System.out.println("Years: " + period.getYears());
        System.out.println("Months: " + period.getMonths());
        System.out.println("Days: " + period.getDays());

	}

}
