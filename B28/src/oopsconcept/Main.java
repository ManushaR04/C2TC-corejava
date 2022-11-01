package org.tns.oopsconcepts;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner value = new Scanner(System.in);
		System.out.println("Water consumed(in gallons) :");
		int n = value.nextInt();
		if(n<=45) {
			System.out.println("No tax");
		}
		else if(n>45 && n<=75) {
			System.out.println("Tax rate : Rs.475");
		}
		else if(n>75 && n<=125) {
			System.out.println("Tax rate : Rs.750");
		}
		else if(n>125 && n<=200) {
			System.out.println("Tax rate : Rs.1225");
		}
		else if(n>200 && n<=350) {
			System.out.println("Tax rate : Rs.1650");
		}
		else {
			System.out.println("Tax rate : Rs.2000");
		}
		

	}

}