package tsm01_J_CS2;


public class TestThread implements Runnable {

	public void run() {
		ExceptionReporter er = null;
		MyExceptionReporter test = new MyExceptionReporter(er);
		Throwable t = null;
		test.report(t);
	}
	public static void main(String[] args) throws Exception { 
		
		TestThread t = new TestThread();
		Thread t1 = new Thread(t);
		Thread t2 = new Thread(t);
		Thread t3 = new Thread(t);
		t1.start();
		t2.start();
		t3.start();
	}
}
