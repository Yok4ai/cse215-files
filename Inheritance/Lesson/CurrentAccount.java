package Inheritance.Lesson;

public class CurrentAccount extends Account{
	private float cashOutCharge;
	
	public CurrentAccount() {
		
	}

	public CurrentAccount(int accountNumber, float balance, float cashOutCharge) {
		super(accountNumber, balance);
		this.cashOutCharge = cashOutCharge;
	}

	public float getCashOutCharge() {
		return cashOutCharge;
	}

	public void setCashOutCharge(float cashOutCharge) {
		this.cashOutCharge = cashOutCharge;
	}
	
	
	public boolean Withdraw(float w) {
		if(this.balance<w+cashOutCharge) {
			return false;
		}
		else {
		super.Withdraw(w+cashOutCharge);
		return true;
	}
	}

}
