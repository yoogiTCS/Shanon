package method_overloading;

public class A1 {
	
	public static void main(String[] args) {
		test(123,45);
		talk(1.2,2.1,2,5);
	}
	
	
	
	public static void test (int a,int b) {
		int c=a+b;
		System.out.println(c);
		
	}
	public static void talk(double a,double b,double c,double f) {
		double g ;
		g= a+b+c+f;
		System.out.println(g);
	}

}
