
public class WrapperClassBoxingUnBoxing {
	
	public static void main(String[] args) {
		
		Byte		b = new Byte((byte)10);
		Short		s = new Short((short)4);
		Integer		i = new Integer(30);
		Long		l = new Long(500L);
		Float		f = new Float(3.14F);
		Double		d = new Double(3.141592);
		Character	c = new Character('°¡');
		Boolean		bl = new Boolean(10 > 3);
		
		b.toString();
		f.equals(c);
		
		int i2 = i.intValue();
		
		float f2 = f.floatValue();
		
		System.out.println("=========================");
		
		Integer i3 = new Integer(5);
		Integer i4 = new Integer(5);
		
		System.out.println("i3 == i4     : " + (i3 == i4));
		System.out.println("i3.equals(i4): " + (i3.equals(i4)));
		
	}
	
}
