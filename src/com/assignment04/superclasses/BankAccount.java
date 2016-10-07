package com.assignment04.superclasses;


import java.util.UUID;

import com.assignment04.interfaces.BankOperations;
/**
 * Defining variables and Bankoperations ,implements operations from interface BankOperations 
 * */
public class BankAccount implements BankOperations  {  //Defining variables and Bankoperations ,implements operations from interface BankOperations 
	private String accountNumber = "";
	private double balance = 0;
	private String accountType = "";
	/**
	 * /Use first 6 numbers of UUID to name the accountNumber,Starting Balance with 0,Giving name for type of account.
	 * */
	public BankAccount() {	// 
		this.accountNumber = UUID.randomUUID().toString().substring(0, 6); //Use first 6 numbers of UUID to name the accountNumber
		this.balance = 0; //Starting Balance with 0
		this.accountType = "Bank account"; // Giving name for type of account.
	}	
	/**
	 * Getter that returns accountNumber. 
	 * */
	public String getAccountNumber() { //Getter that returns accountNumber
		return accountNumber;
	}
	/**
	 * Setter that returns accountNumber. 
	 * */
	public void setAccountNumber(String accountNumber) { //Setter that returns accountNumber
		this.accountNumber = accountNumber;
	}
	/**
	 * Getter that returns balance. 
	 * */
	public double getBalance() { //Getter that returns balance
		return balance;
	}
	/**
	 * Setter that returns balance. 
	 * */
	public void setBalance(double balance) { //Setter that returns balance.
		this.balance = balance;
	}
	/**
	 * Getter that returns accountType. 
	 * */
	public String getAccountType() { //Getter that returns accountType.
		return accountType;
	}
	/**
	 * Setter that returns accountType. 
	 * */
	public void setAccountType(String accountType) { //Setter that returns accountType .
		this.accountType = accountType;
	}
	/**
	 * Method that checking that amount of money some trying to  withdraw is positiv.. 
	 * */
	public void withdrawMoney(double amount) { // Method that checking that amount of money some trying to  withdraw is positiv.
		if (amount>=0){
			setBalance(this.balance - amount);
		}else{
			System.out.println("You can not withdraw a negative value!");
		}
				
	}
	/**
	 * Method that checking that amount of money some trying to  withdraw is positiv.. 
	 * */
	public void depositMoney(double amount) { //Method that checking that amount of money some trying to  withdraw is positiv.
		if (amount>=0){
			setBalance(getBalance() + amount);
		}else{
			System.out.println("You can not deposit a negative value!");
		}
		
	}	

	/**
	 * Method toString returns BankAccounts details in a acceptable readable format. 
	 * */
	 @Override
	public String toString() { //Method toString returns BankAccounts details in a acceptable readable format.
		return "BankAccount [accountNumber=" + accountNumber + ", balance=" + balance + ", accountType=" + accountType + "]";
	}	
	
}
