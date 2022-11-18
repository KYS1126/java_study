package test.ch06.exam01.pakage1;

//클래스는 public, default 접근제한자를 가질 수 있다.
//아무것도 안쓰고 class만 있으면 default
public class A2 {
	//접근 제한자를 줄수있는 곳
	//클래스,필드,생성자,메소드
	
	//생성자 :public, default,private 
	public A2(boolean b) {
		
	}
	
	default A2(int b) {
		
	}
	
	private A2(String s) {
		
	}
}
