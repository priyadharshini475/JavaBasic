package mypractice;
import java.util.Scanner;

public class UserDefinedException {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int balance=sc.nextInt();
		int withdraw=sc.nextInt();
		if(balance>=withdraw)
			System.out.println("Withdraw successfull...");
		else {
			try {
				NoSufficientAmount a1=new NoSufficientAmount();
				throw a1;
			}
			catch(NoSufficientAmount  e) {
				e.printStackTrace();   // For give the deatils about the exception we got...
				System.out.println("Amount is insufficient");
			}
		}
	}

}
