package codsoft;

import java.util.Scanner;

class Account {

    double balance;

    public Account(double initialBalance) {
        this.balance = initialBalance;
    }

    public void withdraw(double amount) {
    	
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void displayBalance() {
        System.out.println("Current Balance: " + balance);
    }
}

 class Current extends Account {
	    public Current(double initialBalance) {
	        super(initialBalance);
	    }

	    public void withdraw(double amount) {
	        if (balance >= amount) {
	            balance -= amount;
	            System.out.println("Withdrawn: " + amount);
	        } else {
	            System.out.println("Insufficient balance.");
	        }
	    }
	}

 class Savings extends Account {
	    double min_balance = 100;

	    public  Savings(double initialBalance) {
	        super(initialBalance);
	    }

	    
	    public void withdraw(double amount) {
	        if (balance - amount >=  min_balance) {
	            balance -= amount;
	            System.out.println("Withdrawn: " + amount);
	        } else {
	            System.out.println("Insufficient balance. Minimum balance of " + min_balance + " must be maintained.");
	        }
	    }
	}

public class Atm {

		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);

		        
		        Savings savings = new Savings(500);
		        Current current = new Current(500);

		        System.out.println("Welcome to Banking System\n");
		        while (true) {
		        	System.out.println("1. Domestic\n2. International\n");
		        	System.out.print("Choose an option: ");
		        	int n = scanner.nextInt();
		            if(n==1||n==2) {
		           
		            System.out.println("1. Withdraw\n2. Deposit\n3. Check Balance\n4. Exit");
		            System.out.print("Choose an option: ");
		            int choice = scanner.nextInt();

		            System.out.print("Choose Account Type (1 for Savings, 2 for Current): ");
		            int accountType = scanner.nextInt();

		            Account selectedAccount =(accountType == 1) ? savings : current;

		            System.out.print("Enter your pin : ");
                	int m=scanner.nextInt();
                	String str=Integer.toString(m);
                	if(str.length()==4) {
                	
                		switch (choice) {
		                case 1:
		                    System.out.print("Enter amount to withdraw: ");
		                    double withdrawAmount = scanner.nextDouble();
		                    selectedAccount.withdraw(withdrawAmount);
		                    System.out.print("TRANSACTION COMPLETED ");
		                    break;
		                case 2:
		          
		                    System.out.print("Enter amount to deposit: ");
		                    double depositAmount = scanner.nextDouble();
		                    selectedAccount.deposit(depositAmount);
		                    System.out.print("TRANSACTION COMPLETED");
		                    break;
		                case 3:
		                    selectedAccount.displayBalance();
		                    System.out.print("TRANSACTION COMPLETED ");
		                    break;
		                case 4:
		                    System.out.println("Exiting...");
		                    System.out.print("TRANSACTION COMPLETED ");
		                    System.exit(0);
		                    break;
		                default:
		                    System.out.println("Invalid choice. Try again.");
		                    
                		}
                	}else {
		        		System.out.println("Invalid pin. Try again.");
		        	}
            		  
            	}  
		        
		            System.out.println();
		        }
		    }
	 }

