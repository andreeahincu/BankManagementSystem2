package bankmanagementsystem2;

public class Account {
	// properties
		private String firstName;
		private String lastName;
		private int accid;
		private double balance;
		private int passcode;
		
		// default constructor
		public Account() {
			
		}
		
		// parameterized constructor
		public Account(String firstName, String lastName, int id, double balance, int passcode) {
			super();
			this.firstName = firstName;
			this.lastName = lastName;
			this.accid = id;
			this.balance = balance;
			this.passcode = passcode;
		}

		// getters and setters
		public String getFirstName() {
			return firstName;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public String getLastName() {
			return lastName;
		}

		public void setLastName(String lastName) {
			this.lastName = lastName;
		}

		public int getAccid() {
			return accid;
		}

		public void setAccid(int accid) {
			this.accid = accid;
		}

		public double getBalance() {
			return balance;
		}

		public void setBalance(double balance) {
			this.balance = balance;
		}
		
		public int getPasscode() {
			return passcode;
		}
		
		public void setPasscode(int passcode) {
			this.passcode = passcode;
		}
}
