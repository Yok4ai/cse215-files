package Inheritance.Lesson;

public class Main {
 public static void main(String[] args) {
	Account a1 = new CurrentAccount();
	float a = ((CurrentAccount)a1).getCashOutCharge();
	CurrentAccount c1 = new CurrentAccount();
	SavingsAccount d1 = new SavingsAccount();
	//a1.setValue(100);
	//a1.Withdraw(50);
	c1.setBalance(100);
	c1.setCashOutCharge(4);
	c1.Withdraw(5);
	d1.setBalance(5);
	d1.setInterestRate(5);
	d1.Deposit(100);
	System.out.println(c1.getBalance());
	System.out.println(d1.getBalance());
	
	
}
}
