package A22_11_15.study;

public class KoreaEX {

	public static void main(String[] args) {
		Korea k1 = new Korea("123456-1234567" , "감자바");
		k1.name = "김하서";  //final 이 아니면 자유롭게 변경 가능
//		k1.nation = "미국";  //final 필드는 에러가 난다. 저장값을 변경할 수 없기 때문.

		
		
		System.out.println(k1.name);
		System.out.println(k1.nation); //final 필드도 k1을 통해서 가져와야한다.
		System.out.println(k1.ssn);
		
	}
}
