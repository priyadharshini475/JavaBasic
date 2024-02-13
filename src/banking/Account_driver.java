package banking;
import java.util.*;
public class Account_driver {

	public static void main(String[] args) {
	 Account savacc1=new Savingsaccount("Priyadharshini",12000.00);
	 Account curacc1=new Currentaccount("Manogari",1000.00);
	 Account savacc2=new Savingsaccount("Suvetha",2000.00);
	 Bank bank=new Bank();
	 bank.addaccount(savacc1);
	 bank.addaccount(curacc1);
	 bank.addaccount(savacc2);
	 savacc1.deposit(1000);
	 savacc1.withdraw(500);
	 savacc2.deposit(5000);
	 curacc1.deposit(1500);
	 curacc1.withdraw(500);
	 ArrayList<Account> list2=bank.getallaccount();
	 for(Account acc:list2) {
		 System.out.println(acc.getname());
		 System.out.println("Interest is "+acc.viewinterest());
		 System.out.println("Balance is "+acc.viewbalance());
		 System.out.println();
	 }

	}

}
