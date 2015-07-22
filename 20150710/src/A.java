public class A{
	int i;
	static int si;
	
	A thisInstance = this;
	int i2 = this.i;
	
	void m(){
		System.out.println(si);
		System.out.println(i);
		System.out.println(this.si);
		System.out.println(this.i);
		System.out.println(thisInstance);
	}
	
	static void sm(){ 
		System.out.println(si); 
//		System.out.println(i);
//		System.out.println(this.si);
//		System.out.println(this.i);
//		m();
	}     
}
