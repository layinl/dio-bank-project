package me.dio.challenge;

/**
 * Default Account interface with default bank account methods
 */
public interface IAccount {

	public void withdraw(double value);

	public void deposit(double value);

	public void transfer(double value, Account account);

}
