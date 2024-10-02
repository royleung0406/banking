package com.javahongkong.bootcamp.exercise;
import java.util.Map;
import java.util.LinkedHashMap;

public class Bank {
	private LinkedHashMap<Long, Account> accounts; // object reference

	public Bank() {
		accounts = new LinkedHashMap<>();
	}

	public Account getAccount(Long accountNumber) {
				return accounts.get(accountNumber);
		};
		

	public Long openCommercialAccount(Company company, int pin, double startingDeposit) {
		if (this.accounts.containsKey(company)) {
			CommercialAccount

			// Add the new commercial account to the accounts map
			accounts.put(accountNumber, commercialAccount);
		}
		return -1L;
	}

	public Long openConsumerAccount(Person person, int pin, double startingDeposit) {
		// complete the function
		return -1L;
	}

	public boolean authenticateUser(Long accountNumber, int pin) {
		boolean isAuthorizedUser = false;
		if (this.accounts.get(accountNumber).validatePin(pin)) {
			isAuthorizedUser = true;
		}
		return isAuthorizedUser;
	}

	public double getBalance(Long accountNumber) {
		return this.accounts.get(accountNumber).getBalance();
		 
	}

	public void credit(Long accountNumber, double amount) {
		this.accounts.get(accountNumber).creditAccount(amount);
	}

	public boolean debit(Long accountNumber, double amount) {
		boolean canDebit = false;
		if (this.accounts.get(accountNumber).getBalance() > amount){
			canDebit = true;
		}
		return canDebit;
	}
	private Long generateAccount() {
		return accounts.isEmpty() ? 000_000_001L : accounts.keySet().stream().max(Long::compare).orElse(0L) + 1;
}
}