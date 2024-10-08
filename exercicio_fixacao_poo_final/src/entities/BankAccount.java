package entities;

public class BankAccount {

	private final double TAX = 5.00;
	private int accountNumber;
	private String accountHolder;
	private double accountBalance;

	public BankAccount(int accountNumber, String accountHolder) {
		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
	}
	
	public BankAccount(int accountNumber, String accountHolder, double initialDeposit) {
		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
		deposit(initialDeposit);
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public String getAccountHolder() {
		return accountHolder;
	}

	public void setAccountHolder(String accountHolder) {
		this.accountHolder = accountHolder;
	}

	public double getAccountBalance() {
		return accountBalance;
	}
	
	public void deposit(double deposit) {
		accountBalance += deposit;
	}

	public void withDraw(double withDraw) {
		accountBalance -= withDraw + TAX;
	}

	public String toString() {
		return "Account " + accountNumber + ", Holder: " + accountHolder + ", Balance: $ " + String.format("%.2f", accountBalance);
	}
}
