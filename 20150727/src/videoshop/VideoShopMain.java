package videoshop;

public class VideoShopMain {
	
	public static void main(String[] args) {
		
		VideoShop videoShop = new VideoShop();
		
		ThreadStateMonitor monitor = new ThreadStateMonitor();
		
		Customer c1 = new Customer(videoShop);
		Customer c2 = new Customer(videoShop);
		Customer c3 = new Customer(videoShop);
		Customer c4 = new Customer(videoShop);
		Customer c5 = new Customer(videoShop);
		Customer c6 = new Customer(videoShop);
		Customer c7 = new Customer(videoShop);
		Customer c8 = new Customer(videoShop);
		
		monitor.addCustomer(c1);
		monitor.addCustomer(c2);
		monitor.addCustomer(c3);
		monitor.addCustomer(c4);
		monitor.addCustomer(c5);
		monitor.addCustomer(c6);
		monitor.addCustomer(c7);
		monitor.addCustomer(c8);
		
		c1.setName("绊按1");
		c2.setName("绊按2");
		c3.setName("绊按3");
		c4.setName("绊按4");
		c5.setName("绊按5");
		c6.setName("绊按6");
		c7.setName("绊按7");
		c8.setName("绊按8");
		
		monitor.start();
		
		c1.start();
		c2.start();
		c3.start();
		c4.start();
		c5.start();
		c6.start();
		c7.start();
		c8.start();
		
	}
	
}
