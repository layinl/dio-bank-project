package me.dio.challenge;

/**
 * The mother of all bank accounts in this program
 */

public abstract class Account implements IAccount {

	private static final String DEFAULT_AGENCY = "0001";
	private static int SEQUENTIAL = 1;
	protected String agency;
	protected int number;
	protected double balance;
	protected Client client;

	public Account(Client client) {
		this.agency = Account.DEFAULT_AGENCY;
		this.number = SEQUENTIAL++;
		this.client = client;
	}
	public Account(Client client, String agency) {
		this.agency = agency;
		this.number = SEQUENTIAL++;
		this.client = client;
	}

	public String getAgency() {
		return agency;
	}

	public int getNumber() {
		return number;
	}

	public double getBalance() {
		return balance;
	}

	@Override
	public String toString() {
		return String.format("""
			Client: %s
			Agency: %s
			Number: %d
			Balance: %.2f""", client, agency, number, balance);
	}

	@Override
	public void withdraw(double value) {
		if (value <= balance) balance -= value;
		else System.out.println("Withdraw value can't be higher than your balance");
	}

	@Override
	public void deposit(double value) {
		balance += value;
	}

	@Override
	public void transfer(double value, Account targetAccount) {
		this.withdraw(value);
		targetAccount.deposit(value);
	}

	public String getStatement() {
		return client + "'s statement\n" + this;
	}

	public void applyInterest() {
		// Empty for now
	}

}
