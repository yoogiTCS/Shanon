package method_overloading;

public class A3 {
	public static void main(String[] args) {
		w1(12,45);
		w1(12.6,45.8);
		w1(12.5,45.8);
		w1(12.7,45.9);
	}
	
	public static void w1(short a, short b) {
		System.out.println(a+b);
		
	}
	public static void w1(int a, int b) {
		System.out.println(a+b);
		
	}public static void w1(float a, float b) {
		System.out.println(a+b);
		
	}public static void w1(double a, double b) {
		System.out.println(a+b);
		
	}
}
