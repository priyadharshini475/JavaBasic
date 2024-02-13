package homework;
import java.util.Scanner;
public class Adding_digit {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);  
        System.out.println("Enter num");
        int num=sc.nextInt();
        int sum=0;
        if(num>0 && num<1000) {
        while(num>0) {
        	sum+=(num%10);
        	num/=10;
        }
        System.out.println("The sum is "+sum);}
        else {
        	System.out.println("Invalid number");
        }

	}

}
