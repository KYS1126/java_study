package A22_11_14.study;

public class MemberService {
	String id;
	String password;

	MemberService() {}
	
	
	
	
	public boolean login(String id, String password) {
		if (id=="hong" && password == "12345") {
		     return true;
		} else {
			return false;
		}
	}
	
	public void logout (String id) {
		System.out.println(id + "님이 로그아웃 되었습니다.");
	}
	

	public static void main(String[] args) {
		
		MemberService memberService = new MemberService();

		boolean result = memberService.login("hong", "12345");

		if(result) {
		     System.out.println("로그인 되었습니다.");
		     memberService.logout("hong");
		} else {
		     System.out.println("id 또는 password가 올바르지 않습니다.");
		}

	}
	
	
	
	
	
	
	
	
	
	
	
//	MemberService MemberService = new MemberService();
//	
//	boolean result = MemberService.login("hong", "12345");
//	
//	boolean login () {
//		if(result) {
//		     System.out.println("로그인 되었습니다.");
//		     MemberService.logout("hong");
//		} else {
//			System.out.println("id 또는 password가 올바르지 않습니다.");
//		}
//	}
	
	
	
	
}
