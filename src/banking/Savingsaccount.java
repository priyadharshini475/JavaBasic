package banking;

public class Savingsaccount implements Account {
     private double balance;
     private String name;
    // private double initialamount;
     public Savingsaccount(String name,double initialamount) {
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
		if(balance>=amount)
			balance-=amount;
		else
			System.out.println("Balance is not sufficient to withdraw");
		
	}

	@Override
	public double viewinterest() {
		// TODO Auto-generated method stub
		double i1=(0.5)*balance;
		return i1;
	}

	@Override
	public double viewbalance() {
		// TODO Auto-generated method stub
		return balance;
	}

}
