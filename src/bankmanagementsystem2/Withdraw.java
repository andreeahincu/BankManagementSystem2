package bankmanagementsystem2;
import java.util.Scanner;

public class Withdraw {
	public Withdraw(Scanner scanner, Account acc) {
		System.out.println("Enter amount: ");
		double amount = scanner.nextDouble();
		
		if(acc.getBalance() >= amount) {
			acc.setBalance(acc.getBalance() - amount);
			System.out.println("Operation done successfully");
		} else
			System.out.println("Not enough funds. Only " + acc.getBalance() + " available");
	}

}
