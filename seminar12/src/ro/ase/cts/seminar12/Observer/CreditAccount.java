package ro.ase.cts.seminar12.Observer;

public class CreditAccount extends BankAccount implements Depositable,Withdrawable,Transferable {

	//entitate Observabil concret
	
	public CreditAccount(double balance, String iban) {
		super(balance,iban);
	}
	
	@Override
	public void deposit(double amount) {
		if(amount>0) {
			this.balance += amount;
		}	
	}

	@Override
	public void withdraw(double amount) throws InsufficientFundsException {
		//metoda care are rolul de a notifica observatorii
		if(amount>0) {
			this.balance -= amount;
		}
		for(NotificationInterface observer: this.observers) {
			observer.notifyUser(amount);
		}
	}

	@Override
	public void transfer(double amount, Depositable destination)
			throws IllegalTransferException, InsufficientFundsException {
		throw new UnsupportedOperationException();
		
	}

	
}
