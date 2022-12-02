package A22_11_25.study;

public class StringbuilderEx {

	public static void main(String[] args) {
		String data = new StringBuilder()
			.append("DEF") //문자열 끝에 붙여준다.
			.insert(0, "abc") //중간에 넣는다.(인덱스 번호로 구별)
			.delete(3, 4) //문자열 일부를 삭제해줌(시작위치, 끝위치)
			.toString(); //완성된 문자열을 Strinf 타입으로 리턴
		System.out.println(data);
		
	}

}
