package assignments;
import java.util.Scanner;

public class Light {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Scanner light=new Scanner(System.in);
        System.out.println("Enter the hour :");
        int hour=light.nextInt();
        if(hour>0&&hour<=24)
        {
           if(hour>0&&hour<=6)
             System.out.println("It is sleeping time");
           else if(hour>6&&hour<=18)
             System.out.println("Switch off the light");
           else
             System.out.println("Switch on the light");
        }
        else
         {
        System.out.println("time does not exceed");

	}

	}

}