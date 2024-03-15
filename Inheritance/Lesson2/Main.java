package Inheritance.Lesson2;

import Lesson2.Vector3D;

public class Main {
	public static void main(String[] args) {
		Vector3D P = new Vector3D(4,6,-2);
		Vector3D Q = new Vector3D(-1,3,4);
		
		System.out.println("Addition = " + P.add(Q));
		System.out.println("Subtraction = " + P.sub(Q));
		System.out.println("Scalar Multiple = " + P.scalarMultiple(-2));
		System.out.println("Dot Product = " + P.dot(Q));
		System.out.println("Distance = " + P.distance(Q));
		System.out.println("Norm = " + Q.norm());
		System.out.println("Cross = " + P.Cross(Q));
		
		boolean longer = P.isLonger(Q);
		if(longer) {
			System.out.println("P is longer");
		}
		else {
			System.out.println("Q is longer");
		}
		
	}

}
