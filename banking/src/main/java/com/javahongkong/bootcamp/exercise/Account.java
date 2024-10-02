package com.javahongkong.bootcamp.exercise;

import java.math.BigDecimal;
import java.math.RoundingMode;

public abstract class Account {
	private AccountHolder accountHolder;
	private Long accountNumber;
	private int pin;
	private double balance;

	protected Account(AccountHolder accountHolder, Long accountNumber, int pin, double startingDeposit) {
		this.accountHolder = accountHolder;
		this.accountNumber = accountNumber;
		this.pin = pin;
	}

	public AccountHolder getAccountHolder() {
	
		return this.accountHolder;
	}

	public boolean validatePin(int attemptedPin) {
		boolean isCorrect = false;
		if (attemptedPin == this.getPin()){
				isCorrect = true;
		}
		return isCorrect;
	}

	public double getBalance() {
		return this.balance;
	}

	public double getPin() {
		return this.pin;
	}

	public Long getAccountNumber() {
		return this.accountNumber;
	}

	public void creditAccount(double amount) {
		this.balance = new BigDecimal(this.balance).add(new BigDecimal(amount)).doubleValue();
	}

	public boolean debitAccount(double amount) {
		boolean canDebit = false;
		if (this.balance > amount){
			canDebit = true;
		}
		return canDebit;
	}
}