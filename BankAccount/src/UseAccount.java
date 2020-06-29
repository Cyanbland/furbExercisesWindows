
public class UseAccount {

	public static void main(String[] args) {
		Account johnsAccount = new Account(01, "John", 5400);
		Account davidsAccount = new Account(02, "David", 76510);
		


		davidsAccount.deposit(500);
		printAccount(davidsAccount);
		
		johnsAccount.withdraw(2700);
		printAccount(johnsAccount);
		
		johnsAccount.printCurrentBalance();

	}
	
	private static void printAccount(Account account) {
		System.out.println("Id da conta: " + account.id);
		System.out.println("Proprietário da conta: " + account.owner);
		System.out.println("Saldo da conta: " + account.balance);
	}

}
