package test.ch07.package2;

public class Q3_Ex10 {

	public static void main(String[] args) {
//		10.	 아래는 변수 num의 값 중에서 일의 자리를 1로 바꾸는 코드이다. 만일 변수 num의
//		값이 333이라면 331이 되고, 777이라면 771이 된다. ( )에 알맞은 코드를 넣으시오.
		int num = 777;
		int result = 0;
		if (num%num == 0) {
			result = (num%10-1);  
		}
		
		System.out.println(num-result);
	}

}
