package pan_002;



	class BankAccount {
	    
	    private String depositorName;
	    private int accountNumber;
	    private String accountType;
	    private double balance;
	    private static double interestRate = 3.5; 
	    
	    public BankAccount() {
	        this.depositorName = "Unknown";
	        this.accountNumber = 0;
	        this.accountType = "Unknown";
	        this.balance = 0.0;
	    }

	    
	    public BankAccount(String depositorName, int accountNumber, String accountType, double balance) {
	        this.depositorName = depositorName;
	        this.accountNumber = accountNumber;
	        this.accountType = accountType;
	        this.balance = balance;
	    }

	    
	    public void deposit(double amount) {
	        if (amount > 0) {
	            balance += amount;
	            System.out.println("Deposited: " + amount);
	        } else {
	            System.out.println("Invalid deposit amount.");
	        }
	    }

	    
	    public void withdraw(double amount) {
	        if (amount > 0 && balance - amount >= 0) {
	            balance -= amount;
	            System.out.println("Withdrawn: " + amount);
	        } else {
	            System.out.println("Insufficient balance or invalid withdrawal amount.");
	        }
	    }

	    
	    public void display() {
	        System.out.println("Depositor Name: " + depositorName);
	        System.out.println("Account Number: " + accountNumber);
	        System.out.println("Account Type: " + accountType);
	        System.out.println("Balance: " + balance);
	    }

	    
	    public static void displayInterestRate() {
	        System.out.println("Rate of Interest: " + interestRate + "%");
	    }

	    public static void main(String[] args) {
	        
	        BankAccount account1 = new BankAccount();
	        account1.display();
	        BankAccount.displayInterestRate();

	        
	        BankAccount account2 = new BankAccount("Alice", 12345, "Savings", 1000.0);
	        account2.display();
	        BankAccount.displayInterestRate();

	        
	        account2.deposit(500.0);
	        account2.withdraw(200.0);
	        account2.display();
	    }
	}
