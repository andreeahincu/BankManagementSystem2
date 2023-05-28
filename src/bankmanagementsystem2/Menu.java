package bankmanagementsystem2;
import java.util.Scanner;
import java.util.ArrayList;

public class Menu {
	public Menu(Scanner scanner, Account acc, Database database, ArrayList<Account> accounts) {
		int j=0;
		System.out.println("Welcome " + acc.getFirstName() + " "+ acc.getLastName());
		do {
		System.out.println("1. Deposit\n2. Withdraw\n3. Balance\n4. Exit");
		
		 j = scanner.nextInt();
		 
		switch(j) {
		case 1:
			new Deposit(scanner, acc);
			break;
		case 2:
			new Withdraw(scanner, acc);
			break;
		case 3:
			System.out.println("Your balance is: " + acc.getBalance());
			break;
		case 4:
			database.saveAccounts(accounts);
			System.out.println("Exiting now...");
			//scanner.close();
			break;
		default:
			System.out.println("Please choose an option from 1 to 4");
		}
		} while(j!=4);
	}
}



