package com.BankingSystem;

public class BankingOperations {

	public void checkBalance() {
		if(LoginManager.getInstance().isLoggedIn()){
			System.out.println("Displaying Balance...");
		}
		else {
			System.err.print("User is not logged in\n");
		}
	}

	public void deposit(double amount) {
		if(LoginManager.getInstance().isLoggedIn()) {
			System.out.println("Depositing "+amount);
		}
		else {
			System.err.println("User is not logged in\n");
		}
	}

	public void withdraw(double amount) {
		if(LoginManager.getInstance().isLoggedIn()) {
			System.out.println("Withdrawing "+amount);
		}
		else {
			System.err.println("User not logged in\n");
		}
	}

}