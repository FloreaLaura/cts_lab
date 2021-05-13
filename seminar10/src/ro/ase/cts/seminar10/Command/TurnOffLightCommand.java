package ro.ase.cts.seminar10.Command;

public class TurnOffLightCommand implements CommandInterface{

	public LightBulb lightBulb;
	
	
	public TurnOffLightCommand(LightBulb lightBulb) {
		super();
		this.lightBulb = lightBulb;
	}


	@Override
	public void execute() {
		// TODO Auto-generated method stub
		
	}

}
