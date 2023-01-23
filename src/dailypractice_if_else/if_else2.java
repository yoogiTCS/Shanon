package dailypractice_if_else;
import java .util.*;
public class if_else2 {
	public static void main(String[] args) {
		int a;
		int b;
		Scanner d =new Scanner (System.in);
		System.out.println("enter a");
		a =d.nextInt();
		System.out.println("enter b");
		b =d.nextInt();
		if (a==b) {
			System.out.println("number are equal");
			
		}else if(a>b) {
			System.out.println("a is greater");
		}
		else {
			System.out.println("b is greater");
		}
			 
	}

}
