package assignments;
import java.util.Scanner;

public class Bank {
	

	
	    private String accno;
	    private String name;
	    private long balance;

	    Scanner KB = new Scanner(System.in);

	  
	    void openAccount() {
	        System.out.print("Enter Account No: ");
	        accno = KB.next();
	        System.out.print("Enter Name: ");
	        name = KB.next();
	        System.out.print("Enter Balance: ");
	        balance = KB.nextLong();
	    }

	   
	    void showAccount() {
	        System.out.println(accno + "," + name + "," + balance);
	    }

	    
	    void deposit() {
	        long amt;
	        System.out.println("Enter Amount U Want to Deposit : ");
	        amt = KB.nextLong();
	        balance = balance + amt;
	    }

	    
	    void withdrawal() {
	        long amt;
	        System.out.println("Enter Amount U Want to withdraw : ");
	        amt = KB.nextLong();
	        if (balance >= amt) {
	            balance = balance - amt;
	        } else {
	            System.out.println("Less Balance..Transaction Failed..");
	        }
	    }

	   
	    boolean search(String acn) {
	        if (accno.equals(acn)) {
	            showAccount();
	            return (true);
	        }
	        return (false);
	    }
	}

	