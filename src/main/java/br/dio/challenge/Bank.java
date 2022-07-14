package br.dio.challenge;

import java.util.ArrayList;
import java.util.List;

/**
 * Bank class, storing all clients
 */
public class Bank {

	private String name;
	private List<Client> client;

	public Bank(String name) {
		this.name = name;
		client = new ArrayList<>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Client> getClient() {
		return client;
	}

	public void addClient(Client client) {
		this.client.add(client);
	}

	@Override
	public String toString() {
		return "Bank{" +
			"name='" + name + '\'' +
			", client=" + client +
			'}';
	}

}
