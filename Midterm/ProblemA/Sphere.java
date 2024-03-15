package Midterm.ProblemA;

public class Sphere {
	private double radius;

	public Sphere(double radius) {
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}
	
	public double getSurfaceArea(){
		double result = Math.pow(this.radius, 2)*Math.PI*4;
		return result;
	}
	
	public double getVolume() {
		float n = ((float)4/3);
		double result = n*Math.pow(this.radius, 3)*Math.PI;
		return result;
	}

	@Override
	public String toString() {
		return "Sphere [radius=" + radius + ", getRadius()=" + getRadius() + ", getSurfaceArea()=" + getSurfaceArea()
				+ ", getVolume()=" + getVolume() + "]";
	}
	

}
