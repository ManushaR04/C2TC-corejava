package assignments;
import java.util.Scanner;

public class Details {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the details:");
		String name=sc.nextLine();
		int age=sc.nextInt();
		int s1_mark=sc.nextInt();
		int s2_mark=sc.nextInt();
		int s3_mark=sc.nextInt();
		int total_marks=s1_mark+s2_mark+s3_mark;
		float avg=total_marks/3;
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("Subject1 marks: "+s1_mark);
		System.out.println("Subject2 marks: "+s2_mark);
		System.out.println("Subject3 marks: "+s3_mark);
		System.out.println("Total marks: "+total_marks);
		System.out.println("Average: "+avg);

	}

}