package tsm01_J_CS2;

import java.util.logging.Level;
import java.util.logging.Logger;

//Class MyExceptionReporter derives from DefaultExceptionReporter 
public class MyExceptionReporter extends DefaultExceptionReporter {

	private final Logger logger;
	public MyExceptionReporter(ExceptionReporter er) { 
		super(er); // Calls superclass's constructor
		// Obtain the default logger
		logger = Logger.getLogger("com.organization.Log");
	}
	
	public void report(Throwable t) { 
		logger.log(Level.FINEST,"Loggable exception occurred", t);
	} 
}