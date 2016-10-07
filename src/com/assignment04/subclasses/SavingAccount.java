package com.assignment04.subclasses;

import java.util.UUID;

import com.assignment04.superclasses.BankAccount;
/**
 *  Subclass SavingAccounts extends BankAccount.
 *  
 * */
public class SavingAccount extends BankAccount{ //Subclass SavingAccounts extends BankAccount.
	public SavingAccount() {	//Constructor invoking objects  with help of this. keyword.
		this.setAccountNumber(UUID.randomUUID().toString().substring(0, 6)); 
		this.setBalance(0.0);
		this.setAccountType("Saving account");
	}
}
