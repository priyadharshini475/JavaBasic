package banking;
import java.util.*;
public class Currentaccount implements Account{
    private double balance;
    private String name;
 //   private double initialamount;
    public  Currentaccount(String name,double initialamount) {
   	 this.name=name;
   	 balance+=initialamount;
    }
    public String getname() {
    	return name;
    }
	@Override
	public void deposit(int dep) {
		balance+=dep;
		
	}

	@Override
	public void withdraw(int amount) {
		balance-=amount;
		
	}

	@Override
	public double viewinterest() {
		return (0.2*balance);
	}

	@Override
	public double viewbalance() {
		return balance;
	}
	

}
