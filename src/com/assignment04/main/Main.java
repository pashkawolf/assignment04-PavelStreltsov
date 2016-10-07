package com.assignment04.main;
import com.assignment04.subclasses.BankCustomer;

import com.assignment04.subclasses.PersonalAccount;
import com.assignment04.subclasses.SavingAccount;
import com.assignment04.superclasses.BankAccount;
/**
 * 
 * @author pavel
 *
 */
public class Main {
		public static void main(String[] args){
			String account = ""; /** String account sett to 0 */
			BankCustomer bc = new BankCustomer("Pavel",42); //Defining constructor bc
			bc.addAccount(new BankAccount()); //Defining new Bank Account
			bc.addAccount(new PersonalAccount());  //Defining new Personsl Account
			bc.addAccount(new SavingAccount());  //Defining new Saving Account
			System.out.println(bc.toString());  //Printing out info about accounts that belongs to bank customer.
			
			account = bc.getCustomerAccounts().get(0).getAccountNumber();
			System.out.println("depositing 30.0 to the first account");
			bc.depositToAccount(account, 30.0); //Depositing money to account
			System.out.println(bc.toString()); //Printing out info about accounts that belongs to bank customer.
			
			System.out.println("Withdrawing 200.0 from the first account");
			account = bc.getCustomerAccounts().get(1).getAccountNumber();
			bc.withdrawFromAccount(account, 200.0); //Withdrawing money to account
			System.out.println(bc.toString()); //Printing out info about accounts that belongs to bank customer.
			/**
			 * HEJ PAWEL
			 */
			
			System.out.println("Depositing 200.0 to the first account");
			account = bc.getCustomerAccounts().get(2).getAccountNumber();
			bc.depositToAccount(account, 200.0); /** Depositing money to account*/
			System.out.println(bc.toString()); //Printing out info about accounts that belongs to bank customer.
		}

	}

