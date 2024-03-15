package Inheritance.Lesson;

public class Account {
	private int accountNumber = 5467;
	protected float balance;
	
	public Account() {
		
	}

	public Account(int accountNumber, float value) {
		super();
		this.accountNumber = accountNumber;
		this.balance = value;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	//public void setAccountNumber(int accountNumber) {
	//	this.accountNumber = accountNumber;
	//}

	public float getBalance() {
		return balance;
	}

	public void setBalance(float value) {
		this.balance = value;
	}
	
	public void Deposit(float d) {
		 this.balance= this.balance + d;
	}
	public boolean Withdraw(float w) {
		if(this.balance<w) {
			return false;
		}
		else {
		this.balance = this.balance - w;
		return true;
		}
	}
	public float Balance() {
		return balance;
	}

	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", balance=" + balance + "]";
	}
	

}
