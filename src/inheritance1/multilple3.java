package inheritance1;
import java .util.*;
public class multilple3 extends multilple2 {
	public void cond() {
		System.out.println("age is breater or not ");
		Scanner sc = new Scanner (System.in);
		int age;
		System.out.println("enter age value ");
		age = sc.nextInt();
		if (age>18) {
			System.out.println("we are married");
		}else {
			System.out.println("we are not marride");
		}
	}

}
