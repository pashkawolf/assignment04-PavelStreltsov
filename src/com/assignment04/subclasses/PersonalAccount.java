package com.assignment04.subclasses;


import java.util.UUID;

import com.assignment04.superclasses.BankAccount;
/**
 * subclass PersonalAccount extends superclass BankAccount.
 *  
 * */
public class PersonalAccount extends BankAccount{ //subclass PersonalAccount extends superclass BankAccount
	public PersonalAccount() {	//Invokes objects with help of keyword this.
		this.setAccountNumber(UUID.randomUUID().toString().substring(0, 6));
		this.setBalance(0.0);
		this.setAccountType("Personal account");
	}
}
