package Inheritance.Lesson;

import Inheritance.Lesson.Account;

public class SavingsAccount extends Account {
	private float interestRate;
	
	public SavingsAccount() {
		
	}

	public SavingsAccount(int accountNumber, float balance, float interestRate) {
		super(accountNumber, balance);
		this.interestRate = interestRate;
	}

	public float getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(float interestRate) {
		this.interestRate = interestRate;
	}
	
	
	public void Deposit(float d) {
		
		super.Deposit(d+(d*interestRate/100));
	}

}
