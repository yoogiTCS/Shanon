package daily_inheritance;
import java .util.*;
public class addlogic extends swaplogic {
	public void add()
	{ 
		swaplogic dd = new swaplogic ();
		dd.swap();
		Scanner sc = new Scanner(System.in);
		System.out.println("addition of two number ");
		int a;
		System.out.println("enter value of a number ");
		a = sc.nextInt();
		int b;
		System.out.println("enter value of b");
		b = sc.nextInt();
		System.out.print("addition of two number is=");
		int c;
		c = a+b;
		System.out.println(c);
		
	}
}
