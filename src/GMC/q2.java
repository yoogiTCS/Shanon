package GMC;
import java.util.*;
public class q2 {
public static void main(String[] args) {
	System.out.println("to print *parttern");
	int i;
	int j;
	int n;
	int m;
 Scanner sc =new Scanner(System.in);
 System.out.println("enter n");
 n =sc.nextInt();
 System.out.println("enter m");
 m =sc.nextInt();
 for(i=1;i<=n;i++) {
	 
	 for(j=1;j<=m;j++) {
		 if(i==1 ||j==1 ||i==n||j==m) {
			 System.out.print("*");}
		 else { 
			 System.out.print("  ");
		 }
		 
	
	 }System.out.println();
		 
 }
 

}
}