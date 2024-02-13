package homework;
import java.util.Scanner;
public class Temperature {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter fahrenheit");
		double fahrenheit=sc.nextDouble();
		double celsius=((fahrenheit-32)*5)/9;
        System.out.println("The celsius is "+celsius);
     }

}
