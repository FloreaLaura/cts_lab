package ro.ase.cts.seminar8.decorator;

public abstract class AbstractBackpackDecorator extends AbstractBackpack {

	public AbstractBackpackDecorator(AbstractBackpack basicBackpack) {
		super();
		this.basicBackpack = basicBackpack;
	}

	protected AbstractBackpack basicBackpack;
	
}
