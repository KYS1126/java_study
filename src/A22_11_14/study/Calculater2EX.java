package A22_11_14.study;

public class Calculater2EX {

	public static void main(String[] args) {
		//객체생성 = 인스턴스를 생성
//		Calculater2 calc2 = new Calculater2();
		//static을 붙이지 않으면
		//인스턴스를 통해서만 접근 할수있다.
		//인스턴스 멤버라고 한다.
//		calc2.pi = 10;
//		calc2.puls(1, 2);
		
		//정적 메소드, (static) //전역변수라고 이해하세요
		Calculater2.puls(1, 2); //객체(인스턴스)를 생성하지 않아도 접근가능
		Calculater2.minus(1, 2);
		System.out.println(Calculater2.pi);
		
		
	}

}
