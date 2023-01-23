package daily_inheritance;
import java .util.*;
public class swaplogic {
	public void swap() {
		Scanner sc = new Scanner (System.in);
		System.out.println("swaping of two number ");
		int a;
		System.out.println("enter valu of a");
		a  = sc.nextInt();
		int b; 
		System.out.println("enter value of b");
		b = sc.nextInt();
		int temp;
		temp=a;
		a=b;
		b=temp;
		System.out.println("swapping of two number without using 3rd variable ");
		System.out.print("then value of a  =");
		System.out.println(a);
		System.out.print("then value of b  =");
		System.out.println(b);
		
	}

}
	