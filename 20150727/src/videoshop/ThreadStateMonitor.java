package videoshop;

import java.util.ArrayList;

public class ThreadStateMonitor extends Thread {
	
	private ArrayList<Customer> customers;
	
	public ThreadStateMonitor() {
		customers = new ArrayList<>();
	}
	
	public void addCustomer(Customer c) {
		customers.add(c);
	}
	
	@Override
	public void run() {
		boolean allStopped = false;
		while (!allStopped) {
			allStopped = true;
			System.err.println("-------------------------");
			for (Customer c : customers) {
				System.err.println(c.getName() + ": " + c.getState());
				allStopped &= (c.getState() == Thread.State.TERMINATED);
			}
			System.err.println("-------------------------");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}
