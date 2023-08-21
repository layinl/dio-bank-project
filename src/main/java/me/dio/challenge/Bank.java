package me.dio.challenge;

import java.util.ArrayList;
import java.util.List;

/**
 * Bank class, storing all clients
 */
public class Bank {

	private String name;
	private List<Client> clients;

	public Bank(String name) {
		this.name = name;
		clients = new ArrayList<>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Client> getClients() {
		return clients;
	}

	public void addClient(Client client) {
		this.clients.add(client);
	}

	@Override
	public String toString() {
		return "Bank{" +
			"name='" + name + '\'' +
			", client=" + clients +
			'}';
	}

}
