package bankmanagementsystem2;
import java.util.Scanner;
import java.util.ArrayList;

public class Login {
	public Login(Scanner scanner, ArrayList<Account> accounts, Database database) {
		System.out.println("Enter account id: ");
		int id = scanner.nextInt();
		System.out.println("Enter passcode:");
		int passcode = scanner.nextInt();
		
		Account account = new Account(); // se creaza un cont gol
		boolean exist = false;
		for(Account acc : accounts) {
			if( acc.getAccid() == id && acc.getPasscode() == passcode)
				exist = true;
				account = acc;
		} // se cauta contul in lista de conturi deja existente
		
		if(exist) {
			new Menu(scanner, account, database, accounts);
		} else {
			System.out.println("Account doesn't exist");
		}
	}

}
