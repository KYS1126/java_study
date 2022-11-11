package A22_11_09.study;

public class Opreator {

	public static void main(String[] args) {
		//부호 연산자
		int x = -100;
		x = -x;
		System.out.println(x);
		
		//증감 연산자
		int a = 10;
		int b = 10;
		int z;
		
		//1을 증가시킴
		a++;
		++a;
		System.out.println("a= "+ a);
		System.out.println("---------------");
		
		b--;
		--b;
		System.out.println("b= "+ b);
		System.out.println("---------------");
		
		//후위 연산자 전위 연산자 주의
		z= a++;
		System.out.println("z= " + z);
		System.out.println("a= " + a);
		
		
		
	}

}
