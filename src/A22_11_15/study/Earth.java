package A22_11_15.study;

public class Earth {
	//상수  //자바의서의 상수는 불변하고,공유가능한 값
	//상수를 선언할때는 변수명을 대문자로 쓴다. 스네이크 쓴다.
	//final: 절대 변경 X, static: 전역변수
	static final double EARTH_RAIUS = 6400; //지구 둘레
	static final double EARTH_SURFACE_AREA;
	
	//static블록: static 필드를 초기화 해줄때 사용
	static { //Math.PI->자바에서 제공(PI는 상수라고 유추가능 왜냐 대문자니까)
		EARTH_SURFACE_AREA = 4 * Math.PI * EARTH_RAIUS * EARTH_RAIUS;
	}
	
	
	
	
}
