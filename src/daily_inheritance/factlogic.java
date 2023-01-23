package daily_inheritance;
import java .util.Scanner;
public class factlogic {
	public void fact() {
		int i;
		int no;
		int fa =1;
		Scanner sc = new Scanner (System.in);
		System.out.println("enter the value of no");
		no =sc.nextInt();
		for(i=1;i<=no;i++) {
			fa = fa*i;
			System.out.println(fa);
			
	}

}
}