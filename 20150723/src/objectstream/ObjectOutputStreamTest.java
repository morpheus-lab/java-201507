package objectstream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Member implements Serializable {
	private String name;
	private String loginId;
	private String loginPw;
	private String email;
	
	public Member() {}

	public Member(String name, String loginId, String loginPw, String email) {
		this.name = name;
		this.loginId = loginId;
		this.loginPw = loginPw;
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLoginId() {
		return loginId;
	}

	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}

	public String getLoginPw() {
		return loginPw;
	}

	public void setLoginPw(String loginPw) {
		this.loginPw = loginPw;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "[" + name + ", " + email + "]";
	}
	
}

public class ObjectOutputStreamTest {
	
	public static void main(String[] args) {
		
		try (ObjectOutputStream oout = new ObjectOutputStream(
				new FileOutputStream("member.dat"))) {
			
			Member m = new Member("È«±æµ¿", "gdhong", "1234",
					"gdhong@hong.com");
			
			oout.writeObject(m);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("°´Ã¼ ÀúÀå ¿Ï·á");
		
	}
	
}

































