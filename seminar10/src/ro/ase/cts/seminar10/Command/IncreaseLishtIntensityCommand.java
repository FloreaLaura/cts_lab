package ro.ase.cts.seminar10.Command;

public class IncreaseLishtIntensityCommand implements CommandInterface {
	private LightBulb bulb;

	public IncreaseLishtIntensityCommand(LightBulb bulb) {
		super();
		this.bulb = bulb;
	}

	@Override
	public void execute() {
		bulb.increaseLightIntensity();
	}

}
