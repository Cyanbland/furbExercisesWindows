/* Atributos:
 * - número
 * - titular
 * - saldo
 * 
 * Métodos:
 * - depositar
 * - sacar
 * - consultar
 */


public class Account {
	public int id, balance;
	public String owner;
	
	public Account(int _id, String _owner, int _balance) {
		id = _id;
		owner = _owner;
		balance = _balance;
	}
	
	public void deposit(int valueToBeDeposited) {
		balance += valueToBeDeposited;
	}
	
	public void withdraw(int valueToBeWithdrawn) {
		if (valueToBeWithdrawn <= balance) {
			balance -= valueToBeWithdrawn;
		}
		else {
			System.out.println("Saldo insuficiente para saque.");
		}
	}
	
	public void printCurrentBalance() {
		System.out.println("O saldo atual é R$" + balance);
	}
}
