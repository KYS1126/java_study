package test.ch06.exam01.pakage1;

//클래스는 public, default 접근제한자를 가질 수 있다.
//아무것도 안쓰고 class만 있으면 default
public class A {
	//접근 제한자를 줄수있는 곳
	//클래스,필드,생성자,메소드
	
	//생성자 :public, default,private 
	public A(boolean b) {
		
	}
	
	default A(int b) {
		
	}
	
	private A(String s) {
		
	}
}
