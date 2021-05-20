package ro.ase.cts.seminar12.Observer;

public interface Transferable {
	public void transfer(double amount, Depositable destination)  throws IllegalTransferException, InsufficientFundsException;
}
