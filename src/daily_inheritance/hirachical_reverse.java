package daily_inheritance;
import java .util.*;

public class hirachical_reverse {
	public void rec() {
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		int rev=0;
		//int n;
		int rem;
		System.out.println("enter value of number =");
		n = sc. nextInt();
		if (n!=0) {
			rem = n%10;
			rev = rev*10 + rem;
			n = n /10;
			System.out.println(rev);
			
	}
	
	
	}
}
