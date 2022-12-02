package test.ch07.package2;

public class MemberService {
	String id = "hong";
	String password = "12345";
	
	
	
	public boolean login (String id, String password) {
		if (this.id.equals(id) && this.password.equals(password)) {
			return true;
		} else {
			return false;
		}
	}
}
