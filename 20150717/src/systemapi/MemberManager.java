package systemapi;

import java.util.ArrayList;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;

public class MemberManager {
	
	public static void main(String[] args) {
		
		ArrayList memberList = new ArrayList();
		
		for (int i = 0; i < 3; i++) {
			Member m = new Member();
			m.setName("ȸ��" + (i + 1));
			m.setLoginId("member" + (i + 1));
			m.setEmail("email" + i + "@gmail.com");
			
			memberList.add(m);
		}
		
		for (int i = 0; i < memberList.size(); i++) {
			System.out.println(memberList.get(i));
		}
		
		ArrayList memberListClone = (ArrayList) memberList.clone();
		Member m = (Member) memberListClone.get(2);
		m.setName("�ȳ�ȳ�");
		
		System.out.println("���� ��");
		
		for (int i = 0; i < memberList.size(); i++) {
			System.out.println(memberList.get(i));
		}
		System.out.println("-----------------");
		for (int i = 0; i < memberListClone.size(); i++) {
			System.out.println(memberListClone.get(i));
		}
		
	}
	
}
