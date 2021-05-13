package ro.ase.cts.seminar11.exempluSubiect.factory;

public class ContCredit implements ContBancar{
	private double total = 1000;

	@Override
	public void transfer(ContBancar destinatie, double suma) {
		if (total >= 0) {
			total -= suma;
			destinatie.depune(suma);
			System.out.println("Suma de " +suma + " de lei a fost adaugata in " + destinatie + " -> cont Credit");
		}
	}

	@Override
	public void depune(double suma) {
		total += suma;
		System.out.println("Suma de " +suma + " de lei a fost adaugata in cont curent -> cont Credit");
	}

	@Override
	public String toString() {
		return "ContCredit [total=" + total + "]";
	}


}
