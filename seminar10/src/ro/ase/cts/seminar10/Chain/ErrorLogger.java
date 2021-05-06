package ro.ase.cts.seminar10.Chain;

public class ErrorLogger extends AbstractLogger{

	public ErrorLogger(Verbosity verbosity) {
		super(verbosity);
	}

	@Override
	void write(String message) {
		System.err.println(ErrorLogger.class.getName()+" : "+message);
		
	}

}
