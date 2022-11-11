package A22_11_08.study;

public class Block {

	public static void main(String[] args) {
		int v1 = 15;
		
		if (v1 > 10) {
			int v2 = v1 - 10;  
		}
		int v2 = 10;
		int v3 = v1 + v2 + 5; //현재 v2는 지역변수다. 자바에선 블록으로 기준을잡음
		
		//형식 문자열
		System.out.printf("이름: %s\n","감자바"); //문자열 형태로 츌력
		System.out.printf("이름: %d\n",25); //정수 형대토 출력
		System.out.printf("이름: %f\n",3.14); //실수 형대토 출력
		System.out.printf("이름: %10.2f\n",3.14); //실수 형대토 출력 //10자리를 만드는데 정수가 7자리 .자리 소수점 자리
		
		System.out.printf("정수출력: %6d",123); //정수의 6자리 출력
		
		
		
		
	}

}
