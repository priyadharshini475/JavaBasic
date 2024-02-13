package banking;
import java.util.*;
public class Bank {
	ArrayList<Account> list1;
	public Bank() {
		list1=new ArrayList<>();
	}
	public void addaccount(Account obj) {
		System.out.println("Adding account...");
		list1.add(obj);
	}
	public ArrayList getallaccount() {
		return list1;
	}

}
