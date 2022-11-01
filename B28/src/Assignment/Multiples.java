package assignments;
import java.util.Scanner;

public class multiples {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number :");
		int n = sc.nextInt();
		if(n%3==0) {
			System.out.println(n+" is a multiples of 3");
		}
		else {
			System.out.println(n+" is not a multiples of 3");
		}

	}

}