package ro.ase.cts.seminar11.exempluSubiect.adapter;

import ro.ase.cts.seminar11.exempluSubiect.factory.ContBancar;

public class AdapterCont implements BankAccount,ContBancar{

	private double total=500;
	
	@Override
	public void transfer(ContBancar destinatie, double suma) {
		if (total >= 0) {
			total -= suma;
			destinatie.depune(suma);
			System.out.println(suma + " de lei a fost adaugata in " + destinatie + " -> cont Credit");
		}
	}

	@Override
	public void depune(double suma) {
		total += suma;
		System.out.println(suma + " de lei a fost adaugata in cont curent -> cont Credit");
	}

	@Override
	public void accountTransfer(BankAccount account, double amount) {
		this.transfer(this, amount);
		System.out.println(amount+ " de lei a fost adaugata in contul curent -> AdapterCont");
	}

	@Override
	public String toString() {
		return "AdapterCont [total=" + total + "]";
	}

}
