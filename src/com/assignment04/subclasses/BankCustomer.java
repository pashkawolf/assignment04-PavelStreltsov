package com.assignment04.subclasses;
import java.util.ArrayList;

import com.assignment04.superclasses.BankAccount;
import com.assignment04.superclasses.Human;

/**
 *  Class BankCustomer is a subclass to Human.
 * */
public class BankCustomer extends Human {
	
	/**
	 *  class BankCustomer has parameter from superclass 
	 *  
	 * */
	public BankCustomer(String name, int age) { 
		super(name, age);  

	}
	

	/**
	 *  return customerAccounts
	 *  
	 * */
	public ArrayList<BankAccount> getCustomerAccounts() {
		return customerAccounts;
	}

	/**
	 * object invoking customerAccounts 
	 *  
	 * */
	public void setCustomerAccounts(ArrayList<BankAccount> customerAccounts) { 
		this.customerAccounts = customerAccounts;
	}


	/**
	 * object invoking customerAccounts 
	 * Defining the ArrayList
	 * */
	ArrayList<BankAccount> customerAccounts = new ArrayList<BankAccount>(); 
	
	
	/**
	 * Adding new account as a parameter to array
	 * */
	public void addAccount(BankAccount bankAccount){ 
		customerAccounts.add(bankAccount);
	}
	
	/**
	 * Method that deposits an amount of money to an specific accounts
	 * */
	public void depositToAccount(String accountNumber, double amount){ 
		for (int i = 0;i < customerAccounts.size();i++){  //while counter i less than size of array customerAccounts
			if(customerAccounts.get(i).getAccountNumber().equals(accountNumber)){  //
				customerAccounts.get(i).depositMoney(amount);
			}
		}
	} 
	
	/**
	 * method wich withdraws an amount of money from an specific account
	 * */
	public void withdrawFromAccount(String accountNumber, double amount){ // method wich withdraws an amount of money from an specific account
		for (int i = 0;i < customerAccounts.size();i++){ // while i less than array size 
			if(customerAccounts.get(i).getAccountNumber().equals(accountNumber)){
				customerAccounts.get(i).withdrawMoney(amount);
			}
		}
		
	}
	/**
	 * Method that prints the name and the age of a bankCustomer in one line and, after that, the information of all accounts that the customer. One account per line
	 * */
	public String toString(){ //Method that prints the name and the age of a bankCustomer in one line and, after that, the information of all accounts that the customer. One account per line
		String a =" ";  //Start string a is empty
		for (int i=0;i<customerAccounts.size();i++){ // while i less than size of customerAccounts array
			a = a + (customerAccounts.get(i).toString() + "\n");
		}
		return "Customer:  " + getName()+ "  " + "Age: " + getAge() + "\n" + a;
	}

	

	
}
	
