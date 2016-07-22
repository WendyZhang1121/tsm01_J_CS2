package tsm01_J_CS2;

public class DefaultExceptionReporter implements ExceptionReporter { 
	
	private final DefaultExceptionReporter defaultER;
	protected DefaultExceptionReporter(ExceptionReporter excr) { 
		defaultER = new DefaultExceptionReporter(excr) {
			public void report(Throwable t) { 
				filter(t);
			}

			private void filter(Throwable t) {
				// TODO Auto-generated method stub
				
			}
		};
	}
	
	public static DefaultExceptionReporter newInstance( ExceptionReporter excr) {

		DefaultExceptionReporter der = new DefaultExceptionReporter(excr); 
		excr.setExceptionReporter(der.defaultER);
		return der;
	}
// Default implementations of setExceptionReporter() and report() 

	@Override
	public void setExceptionReporter(ExceptionReporter er) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void report(Throwable exception) {
		// TODO Auto-generated method stub
		
	}
}