package model.entities;

import model.exceptions.DomainException;

public class Reservation {
	private Integer number;
	private String holder;
	private Double balance;
	private Double withdrawLimit;

	public Reservation(Integer number, String holder, Double balance, Double withdrawLimit) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withdrawLimit = withdrawLimit;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {
		return balance;
	}

	public Double getWithdrawLimit() {
		return withdrawLimit;
	}
	public void deposit(double amount) {
		balance+=amount;
	}
	public void withdraw(double amount) throws DomainException {
		if(amount>withdrawLimit) {
			throw new DomainException("The amount exceeds withdraw limit");
		}
		if(amount>balance) {
			throw new DomainException(" Not enough balance");
		}
		balance-=amount;
	}
}
