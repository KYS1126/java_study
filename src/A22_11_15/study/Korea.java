package A22_11_15.study;

public class Korea {
	//final필드 => 처음 초기화 한 값이 최종적인 값. 절대 바뀔수 없다
	//final 필드는 초기값을 무조건 줘야한다.
	//초기값을 주는 방법, 필드선언시 주던가 생성자를 통해서 주던가.
	final String nation = "대한민국";
	final String ssn;

	//인스턴스 필드
	String name;
	
	
	//생성자 //인스턴스가 생성될떄 실행됨
	Korea(String ssn, String name) {
		this.ssn = ssn;
		this.name = name;
	}
	//자바에서의 상수
	//불변의 값(final), 공유해서 사용 가능(static)
	//ex 원주율: 3.14
	
	
}
