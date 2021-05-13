package ro.ase.cts.seminar10.main;

import ro.ase.cts.seminar10.Chain.AbstractLogger;
import ro.ase.cts.seminar10.Chain.LoggerChainFactory;
import ro.ase.cts.seminar10.Chain.Verbosity;
import ro.ase.cts.seminar10.Command.CommandInterface;
import ro.ase.cts.seminar10.Command.DimLightCommand;
import ro.ase.cts.seminar10.Command.IncreaseLishtIntensityCommand;
import ro.ase.cts.seminar10.Command.LightBulb;
import ro.ase.cts.seminar10.Command.RemoteControl;
import ro.ase.cts.seminar10.Command.TurnLightOnCommand;
import ro.ase.cts.seminar10.Command.TurnOffLightCommand;
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
		
		pucteBonus=modulMarketing.getBonus(100);
		System.out.println("Numar puncte bonus: "+pucteBonus);
		
		
		System.out.println("----------------------------------------");
		AbstractLogger loggerChain=LoggerChainFactory.getChainOfLoggers();
		loggerChain.logMessage(Verbosity.INFO, "This log is FYI");
		loggerChain.logMessage(Verbosity.ERROR, "Something went wrong");
		loggerChain.logMessage(Verbosity.DEBUG, "This is debug message");
		

		System.out.println("----------------------------------------");
		//-------------COMMAND-------------------
		
		LightBulb lightBulb=new LightBulb();
		CommandInterface lightOnCommand=new TurnLightOnCommand(lightBulb);
		CommandInterface lightOffCommand=new TurnOffLightCommand(lightBulb);
		CommandInterface dimLightCommand=new DimLightCommand(lightBulb);
		CommandInterface increaseIntensityCommand=new IncreaseLishtIntensityCommand(lightBulb);

		
		RemoteControl remote=new RemoteControl(lightOnCommand, lightOffCommand, dimLightCommand, increaseIntensityCommand);
		remote.pressLightOnButton();
		remote.pressLightOffButton();
		remote.pressDimButton();
		remote.pressIncreaseLightButton();
		
	}

}
