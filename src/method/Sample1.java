package method;
import java.util.*;
public class Sample1 {
	
	public static void M1() {//method 1
		System.out.println("addition of two number ");
		Scanner d= new Scanner(System.in); 
		int a;
		int b;
		System.out.println("enter value of a");
		
		a=d.nextInt();
		System.out.println("enter value of b");
		b=d.nextInt();
			int c;
			c= a+b;
			System.out.println("addition of two number ");
			System.out.println(c);
		
		
	}//m1 method completed
	public static void M2() {//method 2 open
		Scanner sc= new Scanner(System.in);
		System.out.println("subtraction of two number ");
		int f ;
		int e;
		System.out.println("enter value of f");
		f =sc.nextInt();
		System.out.println("enter value of e");
		e=sc.nextInt();
		int g;
		g =f-e;
		System.out.println("subtraction of two number");
		System.out.println(g);
		
	}//method 2 completed

}
