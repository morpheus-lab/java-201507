
public class EmployeeUser {
	
	public static void main(String[] args) {
		
		Employee e1 = new Employee();
		System.out.println("e1 按眉");
		e1.print();
		
		System.out.println("-----------------------------------");
		
		Employee e2 = new Employee("全辨悼", "101", "扁裙");
		System.out.println("e2 按眉");
		e2.print();
		
		System.out.println("-----------------------------------");
		
		Employee e3 = new Employee("缴没", 500, "全焊");
		System.out.println("e3 按眉");
		e3.print();
		
	}
	
}
