package banking;

public interface Account {
     public void deposit(int dep);
     public void withdraw(int amount);
     public double viewinterest();
     public double viewbalance();
     public String getname();
}
