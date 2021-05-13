package ro.ase.cts.seminar11.exempluSubiect.factory;

public interface ContBancar {
	public void transfer(ContBancar destinatie, double suma);
	public void depune(double suma);

}
