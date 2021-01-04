package methods;

public class BankAccount {
	
	private int accountNumber;
	private int money;
	
	public BankAccount() {
		
	}

	public BankAccount(int accountNumber, int money) {
		this.accountNumber = accountNumber;
		this.money = money;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}
	
	

}
