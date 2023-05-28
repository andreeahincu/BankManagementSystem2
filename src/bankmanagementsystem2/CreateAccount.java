package bankmanagementsystem2;
import java.util.ArrayList;
import java.util.Scanner;

public class CreateAccount {
	public CreateAccount(Scanner scanner, int lastaccid, ArrayList<Account> accounts, Database database) {
		
		System.out.println("Enter first name: ");
		String firstName = scanner.next();
		
		System.out.println("Enter last name: ");
		String lastName = scanner.next();
		
		System.out.println("Enter balance: ");
		double balance = scanner.nextDouble();
		
		//System.out.println("Choose the type of account you want to open.\n1. Current account\n2.Economy account");
		//double accountOption = scanner.nextDouble();
		
		System.out.println("Enter passcode (digits only) : ");
		int passcode = scanner.nextInt();
		
		System.out.println("Confirm passcode (digits only) : ");
		int passcodeConf = scanner.nextInt();
		
		if(passcode != passcodeConf) {
			System.out.println("Codes don't match");
			return; // adica executia se opreste daca nu e nimerit codul
		}
		
		//boolean accountCreated = false;
		lastaccid++;
		int id=1000000 + lastaccid; // numarul de cont porneste de la 1000000
		//lastaccid ++;
	
		Account acc = new Account(firstName, lastName, id, balance, passcode); // se creaza un cont cu datele introduse de user
		accounts.add(acc); // se adauga acest cont la lista de conturi
		System.out.println("Your account id: " + id); // se afiseaza id-ul creat pt contul curent
		
		new Menu(scanner, acc, database, accounts); // se afiseaza meniul cu optiunile existente pt contul nou creat
	}
}
