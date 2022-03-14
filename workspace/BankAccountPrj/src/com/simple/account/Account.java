package com.simple.account;

public class Account {
	
	// 절대 직접 접근하지 못하고 게터 세터를 통해서만 접근가능
	private String accountNumber;
	private String name;
	private int balance;
	
	public Account(){
		
	}

	public Account(String accountNumber, String name, int balance) {
		this.accountNumber = accountNumber;
		this.name = name;
		this.balance = balance;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", name=" + name + ", balance=" + balance + "]";
	}
	
//	public static void main(String[] args) {
//		Account acc1 = new Account();
//		acc1.setAccountNumber("029-21-0822-440");
//		acc1.setName("홍길동");
//		acc1.setBalance(10000);
//		
//		System.out.println(acc1);
//	}
}