package A22_11_21.study;

public interface Service {
	//디폴트 메소드
	default void defaultMethod1() {
		System.out.println("defaultMethod1 종속 코드");
	}
	default void defaultMethod2() {
		System.out.println("defaultMethod2 종속 코드");
	}
	
//	//private 메소드 //버전 때문에 못써용
//	private void dafaultCommon () {
//		System.out.println("defaultMethod1 중복 코드");		
//		System.out.println("defaultMethod2 중복 코드");		
//	}
	
	//정적 메소드
	static void staticMethod1() {
		System.out.println("staticMethod1 종속 코드");
	}
	static void staticMethod2() {
		System.out.println("staticMethod2 종속 코드");
	}
	
}
