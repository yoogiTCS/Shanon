package GMC;
import java.util.*;

public class Q1 {//class body open
	public static void main(String[]args) {
		System.out.println("enter value of element");
		int n;
		int m;
		int i;
		int j;
		Scanner sc =new Scanner(System.in);
		System.out.println("enter value of n");
		n = sc.nextInt();
		System.out.println("enter value of m");
		m = sc.nextInt();
		System.out.println("enter value of i");
		i = sc.nextInt();
		
		for(i=1;i<=n;i++) {
			//System.out.println("*" );
			for(j=1;j<=m;j++) {
				System.out.print("*"+"  " );
				
			}System.out.println();
		}
	
	}//main method body closed

}//class body close
