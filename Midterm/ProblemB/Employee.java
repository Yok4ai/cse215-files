package Midterm.ProblemB;

public class Employee {
	private String name;
	private String designation;
	private String phoneno;
	
	public Employee() {
		
	}

	public Employee(String name, String designation, String phoneno) {
		super();
		this.name = name;
		this.designation = designation;
		this.phoneno = phoneno;
	}

	@Override
	public String toString() {
		return "Name= " + name + ", Designation= " + designation + ", Phoneno= " + phoneno;
	}
	

}
