package dailypractice_if_else;
import java .util.Scanner;
public class factorial {
	//public static void main(String[] args) {
	public void m2() {
		Scanner sc = new Scanner (System.in);
		int no;
		System.out.println("enter value of no");
	     no = sc.nextInt();
		System.out.println("factorial of number");
		int fa=1;
		int i;
	for(i=1;i<=no;i++) {
		fa =fa*i;
		//fa =no+fa;
		System.out.println(fa);
	}

}
}
