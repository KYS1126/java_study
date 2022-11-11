package A22_11_09.study;

public class BitLogic {

	public static void main(String[] args) {
		//비트 논리 연산자들
		//논리곱
		System.out.println("45 & 25 = "+ (45 & 25));
		//논리합
		System.out.println("45 | 25 = "+ (45 | 25));
		//베타적 논리합
		System.out.println("45 ^ 25 = "+ (45 ^ 25));
		//논리 부정
		System.out.println("~45 = "+ (~45));
		
		System.out.println("===============================");
		
		//논리곱 연산 대신 쓰는거, 걍 이런게 있구나
		byte recieveData = -128;
		int nusignedInt = Byte.toUnsignedInt(recieveData);
		System.out.println(nusignedInt);
	}

}
