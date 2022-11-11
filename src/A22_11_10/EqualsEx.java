package A22_11_10;

public class EqualsEx {

	public static void main(String[] args) {
		//String은 리터럴이 같으면 같은 주소를 가르킨다.(참조한다.)
		String strVarl = "홍길동";
		String strVar2 = "홍길동";
		
		//값을 비교한게 아니라 같은 주소를 가르킴
		if (strVarl == strVar2) {
			System.out.println("strVarl와 strVar2는 참조가 같음");
		} else {
			System.out.println("strVarl와 strVar2는 참조가 다름");
		}
		
		//값을 비교할땐 equals 함수를 사용
		if (strVarl.equals(strVar2)) {
			System.out.println("strVarl와 strVar2는 문자열이 같음");
		}
		
		
		//new를 선언하면 리터럴 값이 같아도 다른 주소를 가진다.
		String strVar3 = new String("홍길동");
		String strVar4 = new String("홍길동");
		if (strVar3 == strVar4) {
			System.out.println("strVar3와 strVar4는 참조가 같음");
		} else {
			System.out.println("strVar3와 strVar4는 참조가 다름");
		}
		
		
		
		
	}

}
