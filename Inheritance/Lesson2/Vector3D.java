package Lesson2;

public class Vector3D {
	private double a;
	private double b;
	private double c;
	
	public Vector3D() {
		
	}
	public Vector3D(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	public double getA() {
		return a;
	}
	public void setA(double a) {
		this.a = a;
	}
	public double getB() {
		return b;
	}
	public void setB(double b) {
		this.b = b;
	}
	public double getC() {
		return c;
	}
	public void setC(double c) {
		this.c = c;
	}
	
	public Vector3D add(Vector3D v){
		double newA = v.a + this.a;
		double newB = v.b + this.b;
		double newC = v.c + this.c;
		Vector3D result = new Vector3D(newA,newB,newC);
		return result;
	}
	public Vector3D sub(Vector3D v){
		double newA = v.a - this.a;
		double newB = v.b - this.b;
		double newC = v.c - this.c;
		Vector3D result = new Vector3D(newA,newB,newC);
		return result;
	}
	public Vector3D scalarMultiple(double x){
		double newA = x*this.a;
		double newB = x*this.b;
		double newC = x*this.c;
		Vector3D result = new Vector3D(newA,newB,newC);
		return result;
	}
	public double dot(Vector3D v){
		double newA = v.a * this.a;
		double newB = v.b * this.b;
		double newC = v.c * this.c;
		double result = newA+newB+newC;
		return result;
	}
	public double norm(){
		double newA = this.a*this.a;
		double newB = this.b*this.b;
		double newC = this.c*this.c;
		double result = Math.sqrt(newA+newB+newC);
		return result;
	}
	public double distance(Vector3D v) {
		double newA = v.a-this.a;
		double newB = v.b-this.b;
		double newC = v.c-this.c;
		double latestA = Math.pow(newA, 2);
		double latestB = Math.pow(newB, 2);
		double latestC = Math.pow(newC, 2);
		double result = Math.sqrt(latestA+latestB+latestC);
		return result;
	}
	public Vector3D Cross(Vector3D v) {
		double i = this.b*v.c-v.b*this.c;
		double j = -1*(this.a*v.c-v.a*this.c);
		double k = this.a*v.b-v.a*this.b;
		Vector3D result = new Vector3D(i,j,k);
		return result;
		
	}
	
	public boolean isLonger(Vector3D v) {
		return this.norm() > v.norm();
	}
	
	@Override
	public String toString() {
		return "(a=" + a + ", b=" + b + ", c=" + c + ")";
	}
	

}
