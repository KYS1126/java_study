package A22_11_24_1.study;

public class MyResource implements AutoCloseable { //AutoCloseable-리소를 자동으로 닫아주는 자바에서 제공하는 코드
	//필드
	private String name;
	
	//생성자
	public MyResource (String name) {
		this.name = name;
		System.out.println("MyResource 열기" + name + "열기");
	}

	//메소드
	public String read1() {
		System.out.println("MyResource" + name + "읽기");
		return "100";
	}
	public String read2() {
		System.out.println("MyResource 열기" + name + "읽기");
		return "abc";
	}

	@Override
	public void close() throws Exception { //닫아주는 메소드
		//파일을 닫을때 실행하고 싶은 코드 작성
		System.out.println("MyResource" + name + "닫기");
	}
	
}
