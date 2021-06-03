package ro.ase.cts.seminar12.Observer;

public class SMSNotification implements NotificationInterface{

	@Override
	public void notifyUser(double amount) {
		System.out.println("[SMS notification]:"+amount+" extracted.");		
	}

}