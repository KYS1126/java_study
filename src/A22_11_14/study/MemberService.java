package A22_11_14.study;

public class MemberService {
//	String id = "hong";
//	String password = "12345";
	
	MemberService MemberService = new MemberService();
	
	boolean result = MemberService.login("hong", "12345");
	
	boolean login = () {
		if(result) {
		     System.out.println("로그인 되었습니다.");
		     MemberService.logout("hong");
		} else {
			System.out.println("id 또는 password가 올바르지 않습니다.");
		}
	}
	
	
	
	
}
