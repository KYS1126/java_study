package A22_11_08.study;

public class Hello {
	/*주석*/
	//주석.
	/**주석,api 도큐먼트 작성할때 */
	public static void main(String[] args) { //main 안에있는 코드부터 실행한다.
		// TODO Auto-generated method stub
		System.out.println("hello! java");
		int a =10; //이렇게 지정한 변수를 리터럴이라고 한다.
		int b = 12;
		//int a = 10 ,b = 12;   한줄도 가능
		int result = a + b;
		int num = 1;
		
		System.out.println("결과:" + result);
		System.out.println(a+b);
		System.out.println(a + num);
		
		int var1 = 0b1011; //2진수
		int var2 = 0206; //8진수
		int var3 = 365; //10진수
		int var4 = 0xb3; //16진수

		long var5 = 100000000L;
		
		//10진수 출력
		System.out.print(var1 + ":" + var2 + ":" + var3 + ":" + var4);
		System.out.print(var5);
		
		//char 는 문자열이 아니라 문자 하나만 쓸 것.
		//char 은 작은 따옴표 사용 ''
		char c1 = 'A';
		char c2 = 65;
		System.out.print(c1 + ":" + c2);
		
		
		//실수타입
		float var6 = 0.123454565f;
		System.out.print(var6);
		double var7 = 123454565;
		double var8 = 3e6; //3.0 * 10^6
		double var9 = 2e-3; //2.0 * 10^-3
		
		boolean stop = true;
		
		int x = 10;
		boolean result1 = (x == 20);
		
		System.out.print(result1);
		
		if (stop) {
			System.out.print("정지합니다");
		}
		
		// 문자열 쓰는법, String은 객체다.
		// 스트링은 큰 따옴표 사용 ""
		String name = "나는 \"김용수\" 입니다.";  //""를 출력하고 싶을때 \\사용
		String name1 = "나는 \n김용수\n 입니다."; //n은 줄바꿈, t는 탭만큼 띄어쓰기
		String one = "A";
		
		System.out.print(name + one + name1);
		
		
		
	}
	
}







