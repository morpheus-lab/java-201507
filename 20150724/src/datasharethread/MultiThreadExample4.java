package datasharethread;

public class MultiThreadExample4 {
	public static void main(String[] args) {
		
		CalcThread t1 = new CalcThread();
		PrintThread t2 = new PrintThread();
		
		SharedArea sa = new SharedArea();
		
		t1.sharedArea = sa;
		t2.sharedArea = sa;
		
		t1.start();
		t2.start();
		
	}
}
