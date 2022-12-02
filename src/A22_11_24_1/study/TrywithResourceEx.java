package A22_11_24_1.study;

public class TrywithResourceEx {

	public static void main(String[] args) {
		try(MyResource res = new MyResource("A")) {
			//try안에 열고싶은 리소스 객체 생성	
			String data = res.read2(); //NumberFormatException 에러 발생
			int value = Integer.parseInt(data); //int형 변환
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

}
