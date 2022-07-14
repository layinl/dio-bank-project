package br.dio.challenge;

public class Main {
	/**
	 * This is for default testing. You may change it at your will (locally).
	 * @param args - Command line arguments (if you even use it)
	 */
	public static void main(String[] args) {
		System.out.println("======================================================");
		Client layin = new Client("Layin");
		Client darkLayin = new Client("Dark Layin");
		Client sauceHunterLayin = new Client("Sauce Hunter Layin");
		Client aliny = new Client("Aliny");

		Bank bank = new Bank("bank");
		bank.addClient(layin);
		bank.addClient(darkLayin);
		bank.addClient(sauceHunterLayin);
		bank.addClient(aliny);

		Account layinAcc = new DigitalAccount(layin);
		layinAcc.deposit(10000);
		layinAcc.applyInterest();

		System.out.println(bank);
		System.out.println(layinAcc.getStatement());

		System.out.println("======================================================");
	}
}
