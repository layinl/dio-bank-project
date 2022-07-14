package br.dio.challenge;

/**
 * A default checking account
 */
public class CheckingAccount extends Account {

	public CheckingAccount(Client client) {
		super(client);
	}

	@Override
	public String getStatement() {
		return client + "'s checking account statement\n" + this;
	}

}
