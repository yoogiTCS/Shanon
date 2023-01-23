package dailypractice_if_else;
import java .util.*;
public class if_else6 {
	public static void main(String[] args) {
		Scanner sd =new Scanner(System.in);
	
		int marks;
		System.out.println("enter your marks");
		marks =sd.nextInt();
	 
		if(marks>80) {
			System.out.print("very good std");
		}
		else if(marks>65) {
			System.out.print(" good std");
		}
		else if(marks>45) {
			System.out.print("avg  std");
		}
		else if(marks>35) {
			System.out.print("pass std");
		}
		else{
			System.out.println("fail");
		}
		
	}

}
