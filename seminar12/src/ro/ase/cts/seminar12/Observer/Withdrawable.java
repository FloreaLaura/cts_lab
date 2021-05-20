package ro.ase.cts.seminar12.Observer;

public interface Withdrawable {
	public void withdraw(double amount) throws InsufficientFundsException;
}
