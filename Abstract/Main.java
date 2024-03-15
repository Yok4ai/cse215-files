package Abstract;

public class Main {
	public static void main(String[] args) {
		Shape s1 = new Rectangle("Rect", 4.5, 6.7);
		System.out.println(s1.area());
		System.out.println(s1.perimeter());
	}

}
