package com.oopsConcepts;

 class Account {
	//data
	private double balance;
	
	//operation	
	public void withdraw(double amount) {
		if ((balance - amount) > 0) {
			balance -= amount; 
		}
	}
	
	public void deposit(double amount) {
		if (amount > 0) {
			balance += amount;
		}
	}
	 public double getBalance() {
		 return balance;
	}
}

public class DatahidingEncapsulation {

	public static void main(String[] args) {
	
	   Account acc1 = new Account();
	   acc1.deposit(1000);
	   acc1.deposit(5000);
	   
	   acc1.withdraw (500);
	   acc1.withdraw (1000);
	   
	 // acc1.balance = 99999;  //error
	   
	   System.out.println(acc1.getBalance());

	}

}
