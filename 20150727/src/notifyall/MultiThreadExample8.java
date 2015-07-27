package notifyall;

public class MultiThreadExample8 {
	public static void main(String[] args) {
		
		CalcThread t1 = new CalcThread();
		PrintThread t2 = new PrintThread();
		LuxuryPrintThread lpt = new LuxuryPrintThread();
		SimplePrintThread spt = new SimplePrintThread();
		
		SharedArea sa = new SharedArea();
		
		t1.sharedArea = sa;
		t2.sharedArea = sa;
		lpt.sharedArea = sa;
		spt.sharedArea = sa;
		
		t1.start();
		t2.start();
		lpt.start();
		spt.start();
		
	}
}
