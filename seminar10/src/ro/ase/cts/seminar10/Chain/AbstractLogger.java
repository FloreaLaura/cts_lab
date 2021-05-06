package ro.ase.cts.seminar10.Chain;

public abstract class AbstractLogger {
	protected Verbosity level;
	private AbstractLogger nextLogger;
	public void setNextLogger(AbstractLogger logger) {
		this.nextLogger=logger;
	}
	
	public void logMessage(Verbosity level, String message)
	{
		
	}
	
	abstract void write(String message);
	
}
