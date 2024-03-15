package Midterm.ProblemB;

public class FullTimeEmployee extends Employee {
	private double basic = 32000;
	private double allowance = basic*((double)25/100);

	public FullTimeEmployee(String name, String designation, String phoneno) {
		super(name, designation, phoneno);
	}
	
	public void setBasicAllowance(double basic, double allowance) {
		this.basic = basic;
		this.allowance = allowance;
	}
	
	public double getSalary() {
		double salary = this.basic + this.allowance;
		return salary;
	}

	@Override
	public String toString() {
		return "FullTimeEmployee Salary=" + getSalary() + "\n" + super.toString();
	}
	

}
