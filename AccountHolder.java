/*
 * Emma Prager
 * 02/02/2019
 * AccountHolder.java
 * Lab 01
 */

public class AccountHolder {
	
	private double balance;
	private static double annualInterestRate;

	public AccountHolder() {
		// TODO Auto-generated constructor stub
		balance = 0;
	}
	
	public AccountHolder(double balance) {
		if (balance < 0.0)
			throw new IllegalArgumentException("balance must be non-negative");

		this.balance = balance;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public double deposit(double deposit) {
		balance = balance + deposit;
		return balance;
	}
	
	public double withdrawal(double withdrawal) {
		this.balance = balance - withdrawal;
		if(this.balance < 0) {
			negativeBalance(this.balance);
		}
		return this.balance;
	}
	
	public void negativeBalance(double balance) {
		this.balance = balance - 35;
		System.out.println("A $35 overdraft fee has reduced your balance when the balance goes below $0.");
	}

	public void monthlyInterest(double rateUpdate) {
		balance += balance * (annualInterestRate / 12.0);
	}
	
	public static void modifyMonthlyInterest(double rateUpdate) {
		if (!(rateUpdate >= 0 && rateUpdate <= 1.0))
			throw new IllegalArgumentException("rate must be between 0 and 1");
		annualInterestRate = rateUpdate;
	}
	
	public String toString() {
		return String.format("$%.2f", balance);
	}
}
