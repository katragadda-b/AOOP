package com.BankingSystem;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankingOperations operations= new BankingOperations();
		operations.checkBalance();
		LoginManager.getInstance().checklogin();

		operations.checkBalance();
		operations.deposit(1201);
		operations.withdraw(800);
		LoginManager.getInstance().logOut();

		operations.checkBalance();

	}

}
