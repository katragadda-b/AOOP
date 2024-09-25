package com.BankingSystem;

public class LoginManager {

	private static LoginManager instance;
	private boolean loggedIn;
	private LoginManager() {
		this.loggedIn= false;
	}

	public static synchronized LoginManager getInstance() {
		if(instance==null) {
			instance= new LoginManager();
		}
		return instance;
	}

	public void checklogin() {
		if(!loggedIn) {
			loggedIn=true;
			System.out.println("Login Succesfull");
		}
		else {
			System.out.println("User is already logged in");
		}
	}

	public void logOut() {
		if(loggedIn) {
			loggedIn= false;
			System.out.println("Logout successfull");
		}
		else {
			System.out.println("User is already logged out");
		}
	}

	public boolean isLoggedIn() {
		return loggedIn;
	}

}
