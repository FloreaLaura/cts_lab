package ro.ase.cts.seminar12.Observer;

public class EmailNotification implements NotificationInterface{

	@Override
	public void notifyUser(double amount) {
		System.out.println("[Email notification]:"+amount+" extracted.");		
	}

}
