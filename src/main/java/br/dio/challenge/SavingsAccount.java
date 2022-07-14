package br.dio.challenge;

/**
 * A default savings account, with rates based on SELIC interest and general Brazilian savings interest
 * (equal or less than 8.5% of the SELIC interest)
 */
public class SavingsAccount extends Account {

	private static final double INTEREST = 0.1325;
	public SavingsAccount(Client client) {
		super(client);
	}
	@Override
	public String getStatement() {
		return client + "'s savings account statement\n" + this;
	}

	@Override
	public void applyInterest() {
		balance += balance * (INTEREST * 0.7);
	}

}
