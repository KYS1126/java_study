package A22_11_25.Object;

public class Student {
	//필드
	private int no;
	private String name;
	
	//생성자
	public Student(int no, String name) {
		this.no = no;  //필드에 초기값 할당
		this.name = name;
	}

	//메소드
	public int getNo() {
		return no;
	}

	public String getName() {
		return name;
	}
	
	//
	@Override
	public int hashCode() { //String 형은 값이 똑같으면 같은 주소를 가르킨다.
		System.out.println("no: " + no +", "+ "name: " + name.hashCode());
		int hashcode = no + name.hashCode();  //번호하고 이름이 같으면 동일한 hashcode가 생성됨
		return hashcode;
	}

	@Override
	public boolean equals(Object obj) {
		//obj가 student 객체를 가지고 있는지
		if (obj instanceof Student) {
			Student target = (Student)obj; //강제 타입 변환
			
			//no하고 name(String)의 값이 같은지 비교
			if(no == target.getNo() && name.equals(target.getName())) {
				return true;
			}
		}
		return false;
		
	}

	
	
	
}
