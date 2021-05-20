package ro.ase.cts.seminar12.main;

import java.util.ArrayList;

import ro.ase.cts.seminar12.Memento.CharacterMemento;
import ro.ase.cts.seminar12.Memento.GameCharacter;
import ro.ase.cts.seminar12.Observer.BankAccount;
import ro.ase.cts.seminar12.Observer.CreditAccount;
import ro.ase.cts.seminar12.Observer.InsufficientFundsException;
import ro.ase.cts.seminar12.Observer.NotificationInterface;
import ro.ase.cts.seminar12.Observer.SMSNotification;
import ro.ase.cts.seminar12.Template.DecimalFormatter;
import ro.ase.cts.seminar12.Template.HexFormatter;

public class Main {

	public static void main(String[] args) {
		//-----------Observer--------
		CreditAccount account =new CreditAccount(1000,"IBAN000000");
		account.addObserver(new NotificationInterface() {
			
			@Override
			public void notifyUser(double amount) {
				System.out.println("[Inline example]:"+amount+ " extracted.");
				
			}
		});
		NotificationInterface smsNotificationService=new SMSNotification();
		account.addObserver(smsNotificationService);
		try {
			account.withdraw(100);
			account.removeObserver(smsNotificationService);
			account.withdraw(100);
		} catch (InsufficientFundsException e) {
			e.printStackTrace();
		}
		
		
		//--------------------Memento----------
		System.out.println("---------------------------------------------");
		ArrayList<CharacterMemento> saveList=new ArrayList<CharacterMemento>();
		GameCharacter myCharacter=new GameCharacter("Alex", 100);
		saveList.add(myCharacter.generateMemento());
		myCharacter.bleed();
		System.out.println("Character hitpoints: "+myCharacter.getHitpoints());
		myCharacter.setMemento(saveList.get(0));
		System.out.println("Character hitpoints: "+myCharacter.getHitpoints());

		
		//---------Template------------------
		System.out.println("--------------------------------------------");
		DecimalFormatter decimalFormatter=new DecimalFormatter();
		decimalFormatter.displayOutput(10);
		HexFormatter hexFormatter=new HexFormatter();
		hexFormatter.displayOutput(10);
	}

}
