package A22_11_25.study;

import java.util.Arrays;

public class ByteToStringEx {

	public static void main(String[] args) {
		String data = "자바";
		
		//바이트형 배열로 던져준다.
		byte[] arr1 = data.getBytes();  //utf-8로 인코딩 디폴트 값이 utf8임
		
		//배열을 문자열로 바꾼다.
		System.out.println(Arrays.toString(arr1));
		
		String str1 = new String(arr1); //utf-8로 디코딩
		System.out.println(str1);
		
	}

}
