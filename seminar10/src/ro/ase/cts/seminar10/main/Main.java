package ro.ase.cts.seminar10.main;

import ro.ase.cts.seminar10.strategy.MarketingStrategyInterface;
import ro.ase.cts.seminar10.strategy.ModulMarketing;
import ro.ase.cts.seminar10.strategy.RandomMarketingStrategy;

public class Main {

	public static void main(String[] args) {
		ModulMarketing modulMarketing =new ModulMarketing();
		modulMarketing.setCurrentStrategy(new RandomMarketingStrategy());
		modulMarketing.getBonus(100);

		double pucteBonus=modulMarketing.getBonus(100);
		System.out.println("Numar puncte bonus: "+pucteBonus);
		
		modulMarketing.setCurrentStrategy(new MarketingStrategyInterface() {
			
			@Override
			public double calculateBonus(double base) {
				return 30*base;
			}
		});
		pucteBonus=modulMarketing.getBonus(100);
		System.out.println("Numar puncte bonus: "+pucteBonus);
		
		modulMarketing.setCurrentStrategy((base)->{return 20*base;});
	}

}