/*
 * Emma Prager
 * 02/02/2019
 * AccountHolderTest.java
 * Lab 01
 */

import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class AccountHolderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//declare and initialize the variables
		double interest  = 0;
		double deposit = 0;
		double withdrawal = 0;
		double startBalance = 0;
		
		//introduce a Scanner class object
		Scanner sc = new Scanner(System.in);
		
		//Snapshot 1 - run #1
		//prompt user for start balance
		System.out.print("Please enter a starting balance: $");
		startBalance = sc.nextDouble();
		//create new AccountHolder object with given balance
		AccountHolder a1 = new AccountHolder(startBalance);
		//print out balance
		System.out.println("Account Balance: " + a1.toString());
		
		//set monthly interest to 4%
		interest = 0.04;
		AccountHolder.modifyMonthlyInterest(interest);
		
		//deposit amount into user account
		System.out.print("Please enter a deposit amount: $");
		deposit = sc.nextDouble();
		a1.deposit(deposit);
		//print out new balance
		System.out.println("Account Balance: " + a1.toString());
		
		//withdraw amount from user account
		System.out.print("Please enter a withdrawal amount: $");
		withdrawal = sc.nextDouble();
		a1.withdrawal(withdrawal);
		//print out new balance
		System.out.println("Account Balance: " + a1.toString());
		
		//-------------------------------------------------------//
		System.out.println("");
		System.out.println("////////// New User //////////");
		System.out.println("");
		//-------------------------------------------------------//
		
		//Snapshot 2 - run #2
		//prompt user for start balance
		System.out.print("Please enter a starting balance: $");
		//error trapping for negative input
		while (true) {
			  startBalance = sc.nextDouble();
			  if (startBalance < 0)
		                   System.out.print("Please reenter a POSITIVE starting balance: $");
			  else 
			     break;
		}

		//create new AccountHolder object with given balance
		AccountHolder a2 = new AccountHolder(startBalance);
		System.out.println("Account Balance: " + a2.toString());
		
		//get deposit amount from user
		System.out.print("Please enter a deposit amount: $");
		deposit = sc.nextDouble();
		a2.deposit(deposit);
		//print updated balance
		System.out.println("Account Balance: " + a2.toString());
		
		//get withdrawal amount from user
		System.out.print("Please enter a withdrawal amount: $");
		withdrawal = sc.nextDouble();
		a2.withdrawal(withdrawal);
		//print updated balance
		System.out.println("Account Balance: " + a2.toString());
		
		//print out table with monthly balances for 12 months with interest
		System.out.println("\nMonthly balances for one year at 4%");
		System.out.format("%10s%16s", "Balances:","Acct Balance w/ Interest");
		System.out.format("\n%10s%16s", "Base:", a2.toString());
		a2.monthlyInterest(1);
		System.out.format("\n%10s%16s", "Month 1:", a2.toString());
		a2.monthlyInterest(2);
		System.out.format("\n%10s%16s", "Month 2:", a2.toString());
		a2.monthlyInterest(3);
		System.out.format("\n%10s%16s", "Month 3:", a2.toString());
		a2.monthlyInterest(4);
		System.out.format("\n%10s%16s", "Month 4:", a2.toString());
		a2.monthlyInterest(5);
		System.out.format("\n%10s%16s", "Month 5:", a2.toString());
		a2.monthlyInterest(6);
		System.out.format("\n%10s%16s", "Month 6:", a2.toString());
		a2.monthlyInterest(7);
		System.out.format("\n%10s%16s", "Month 7:", a2.toString());
		a2.monthlyInterest(8);
		System.out.format("\n%10s%16s", "Month 8:", a2.toString());
		a2.monthlyInterest(9);
		System.out.format("\n%10s%16s", "Month 9:", a2.toString());
		a2.monthlyInterest(10);
		System.out.format("\n%10s%16s", "Month 10:", a2.toString());	
		a2.monthlyInterest(11);
		System.out.format("\n%10s%16s", "Month 11:", a2.toString());
		a2.monthlyInterest(12);
		System.out.format("\n%10s%16s", "Month 12:", a2.toString());
		
		
		//Close the scanner object
		sc.close();
		
		//Print time stamp for program run
		String timeStamp = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(Calendar.getInstance().getTime());
				System.out.println("\n\nCur dt=" + timeStamp + "\nProgrammed by Emma Prager\n");

	}

}
