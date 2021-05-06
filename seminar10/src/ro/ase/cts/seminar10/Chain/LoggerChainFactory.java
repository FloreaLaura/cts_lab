package ro.ase.cts.seminar10.Chain;

public class LoggerChainFactory {

	public static AbstractLogger getChainOfLoggers() {
		AbstractLogger errorLogger=new ErrorLogger(Verbosity.ERROR);
		AbstractLogger fileLogger=new FileLogger(Verbosity.DEBUG);
		AbstractLogger consoleLogger=new ConsoleLogger(Verbosity.INFO);
		
		errorLogger.setNextLogger(fileLogger);
		fileLogger.setNextLogger(consoleLogger);
		return errorLogger;
	}
}
