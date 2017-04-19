package com.anindya.constructors.main;

import com.anindya.constructors.model.Account;

public class TestAccount {

	public static void main(String[] args) {
		
		 Account timsAccount = new Account("Tim", "tim@email.com","12345");
	        System.out.println(timsAccount.getNumber() + " name " + timsAccount.getCustomerName());
	        System.out.println("Current balance is " + timsAccount.getBalance());
	        timsAccount.withdrawal(100.55);


	}

}
