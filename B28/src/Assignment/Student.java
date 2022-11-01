package assignments;
import java.util.Scanner;

public class Student {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter No of days :");
		int days = sc.nextInt();
		if(days<=5) {
			System.out.println("The fine is "+days*1);
		}
		else if(days>5 && days<=10) {
			System.out.println("The fine is "+days*5);
		}
		else {
			System.out.println("The fine is "+days*10);
		}
	}

}