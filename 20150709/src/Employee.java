
public class Employee {
	
	String name;
	String no;
	String dept;
	
	public Employee() {
		//name = "�̸�����"; no = "�ӽû��"; dept = "�ӽúμ�";
		this("�̸�����", "�ӽû��", "�ӽúμ�");
		System.out.println("���ھ��� ������ ȣ���");
	}
	
	public Employee(String na, String n, String d) {
		name = na; no = n; dept = d;
		System.out.println("2��° ������ ȣ���");
	}
	
	public Employee(String na, int n, String d) {
		//name = na; no = n + ""; dept = d;
		this(na, n + "", d);
		System.out.println("3��° ������ ȣ���");
	}
	
	public void print() {
		System.out.println(name + ", " + no + ", " + dept);
	}
	
}
