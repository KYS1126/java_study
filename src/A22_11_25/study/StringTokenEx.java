package A22_11_25.study;

import java.util.StringTokenizer;

public class StringTokenEx {

	public static void main(String[] args) {
		String data1 = "홍길동&이수홍,박연수";
		
		//배열로 받는다.
		String[] arr = data1.split("&|,"); //정규 표현식
		for(String token : arr) { //향상된 for문으로 하나씩 뽑는다
			System.out.println(token);
		}
		
		
		//StringTokenizer = / 구분자로 나눠주겠다.
		String data2 = "홍길동/이수홍/박연수";
		StringTokenizer st = new StringTokenizer(data2, "/");
		//StringTokenizer는 for문이 아니라 hasMoreTokens실행
		//hasMoreTokens = > 토큰을 가지고 있으면 계속 반복, 아니면 종료
		while (st.hasMoreTokens()) {
			String token = st.nextToken();
			System.out.println(token);
		}
		
		
	}

}
