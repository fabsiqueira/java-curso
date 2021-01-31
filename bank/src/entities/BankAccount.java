package entities;

public class BankAccount {
	private int accountNumber;
	private String name;
	private double deposit;
	
	public BankAccount() {
		
	}
	
	public BankAccount(int accountNumber, String name) {
		this.accountNumber = accountNumber;
		this.name = name;
	}

	public BankAccount(int accountNumber, String name, double initialDeposit) {
		this.accountNumber = accountNumber;
		this.name = name;
		addValue(initialDeposit);
	}
		
	public int getAccountNumber() {
		return accountNumber;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getDeposit() {
		return deposit;
	}
	
	public void addValue (double deposit) {
		this.deposit += deposit;
	}
	
	public void removeValue (double deposit) {
		this.deposit -= deposit + 5.0;	
	}
	public String toString() {
		return "Account " + accountNumber 
				+ ", Holder: " + name 
				+ ", Balance: $ " + String.format("%.2f", deposit);
	}

}
