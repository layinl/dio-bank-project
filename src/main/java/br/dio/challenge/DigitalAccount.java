package br.dio.challenge;

/**
 * A default digital account, with rates based on SELIC interest (100% CDI)
 */
public class DigitalAccount extends Account {

	private static final double INTEREST = 0.1325;

	public DigitalAccount(Client client) {
		super(client);
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
