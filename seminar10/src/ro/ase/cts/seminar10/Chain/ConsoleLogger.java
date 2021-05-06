package ro.ase.cts.seminar10.Chain;

public class ConsoleLogger extends AbstractLogger{

	public ConsoleLogger(Verbosity verbosity) {
		super(verbosity);
	}

	@Override
	void write(String message) {
		System.out.println(ConsoleLogger.class.getName()+" : "+message);
	}

}
