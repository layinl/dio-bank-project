package me.dio.challenge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
	/**
	 * This is for default testing. You may change it at your will (locally).
	 * @param args - Command line arguments (won't be useful for now)
	 */
	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input;
		Bank bank = null;
		System.out.println("======================================================");

		while(true) {
			System.out.println("""
				1-Create bank
				2-Create Account
				3-Print bank and all its clients
				Type "exit" to finish the program.
				""");
			input = scan.next();
			if(input.equalsIgnoreCase("exit")) break;
			switch (input) {
				case "1" -> {
					if(bank == null) {
						System.out.println("Please insert the bank's name");
						//bank = new Bank(scan.next());
						bank = new Bank(br.readLine());
					}
					else System.out.println("Bank was already created");
				}
				case "2" -> {
					if(bank == null) System.out.println("Bank must be created first");
					else {
						System.out.println("Please insert the new client's name");
//						Client newClient = new Client(scan.next());
						Client newClient = new Client(br.readLine());
						bank.addClient(newClient);
						System.out.println("Please insert the agency number (leave blank to set it to the default value: 0001)");
						String agency = br.readLine();
						Account newAccount = (agency.equals(""))? new DigitalAccount(newClient)
							: new DigitalAccount(newClient, agency);
						System.out.println("Please make your first deposit");
						newAccount.deposit(scan.nextInt());
						System.out.printf("""
							"Hello, %s! Thank you for creating your account at our bank!
							Your agency code is %s,
							account %d,
							and your balance (%.2f) is available for withdrawal"
							""",
							newClient, newAccount.getAgency(), newAccount.getNumber(), newAccount.getBalance()
						);
					}
				}
				case "3" -> System.out.println(bank);
				default -> System.out.println("Invalid input.\n");
			}
		}

		/*Client layin = new Client("Layin");
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
		System.out.println(layinAcc.getStatement());*/

		System.out.println("======================================================");

	}

}
