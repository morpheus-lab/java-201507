
public class EmployeeUser {
	
	public static void main(String[] args) {
		
		Employee e1 = new Employee();
		System.out.println("e1 ��ü");
		e1.print();
		
		System.out.println("-----------------------------------");
		
		Employee e2 = new Employee("ȫ�浿", "101", "��ȹ");
		System.out.println("e2 ��ü");
		e2.print();
		
		System.out.println("-----------------------------------");
		
		Employee e3 = new Employee("��û", 500, "ȫ��");
		System.out.println("e3 ��ü");
		e3.print();
		
	}
	
}
