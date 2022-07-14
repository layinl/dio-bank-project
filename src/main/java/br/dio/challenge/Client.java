package br.dio.challenge;

/**
 * Client class, for any client that creates one or many accounts
 */
public class Client {

	private String name;

	public Client(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return this.getName();
	}
}
