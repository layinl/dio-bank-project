package me.dio.challenge;

/**
 * A default digital account, with rates based on SELIC interest
 * as of August 1st, 2023 (100% of the Interbank Deposit Certificate)
 */
public class DigitalAccount extends Account {

	private static final double INTEREST = 0.1325;

	public DigitalAccount(Client client) {
		super(client);
	}

	public DigitalAccount(Client client, String agency) {
		super(client, agency);
	}

	@Override
	public String getStatement() {
		return client + "'s digital account statement\n" + this;
	}

	@Override
	public void applyInterest() {
		balance += balance * (INTEREST);
	}

}
