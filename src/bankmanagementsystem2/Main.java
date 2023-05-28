package bankmanagementsystem2;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
	
	static Scanner scanner;
	static int lastaccid;
	private static ArrayList<Account> accounts;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

			accounts = new ArrayList<>();
			scanner = new Scanner(System.in);
			Database database = new Database();
			accounts = database.getAccounts();
			lastaccid = accounts.size();
			
			int i=0;
			System.out.println("Welcome to bank management system ");
			do {
			System.out.println(" Please choose an option: ");
			System.out.println("1. Create new account");
			System.out.println("2. Login");
			System.out.println("3. Exit");
			 i = scanner.nextInt();
			
			switch(i) {
				case 1: new CreateAccount(scanner, lastaccid, accounts, database);
					break;
				case 2: new Login(scanner, accounts, database);
					break;
				case 3: 
					System.out.println("Exiting now");
					//scanner.close();
					break;
				default:
					System.out.println("Please choose an option from the above, 1, 2 ore 3");
					break;
				}

			}while(i!=3);
	}
}


