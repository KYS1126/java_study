package A22_11_25.Object;

public class Member {
	//필드
	public String id;
	//생성자
	public Member(String id) {
		this.id = id;
	}
	
	//논리적 동등 만들기 : 객체의 주소와 상관없이 필드의 값으로 비교하는법
	@Override
	public boolean equals(Object obj) {
		// instanceof - > obj가 Member객체를 갖고있느냐
		if (obj instanceof Member) { //강제 형변환을 하기 위해 작성함
			Member target = (Member)obj; //강제 형변환 (타입 변환) : 자식 객체에 있는 필드르 뽑아오기 위함
		
			if(id.equals(target.id)) { //여기서의 equals은 String의 equals (순수하게 문자만 비교)
				return true;
			}
			
		} 
		
		return false;
	}

	
	
	


	public static void main(String[] args) {
		Object obj1 = new Object(); // 오브젝트 자체도 클래스라서 객체로 만들 수 있다.
		
		Object obj2 = obj1; //같은 주소를 가르킨다.
		
		System.out.println(obj1.equals(obj2)); //번지수를 비교
		System.out.println(obj1 == (obj2)); //번지수를 비교
		
		//항상 Object라는 클래스에 상속 받고있기 때문에 오버라드가 가능하다
		
		//논리적 동등 : 같은 객체든 다른 객체든 객체 저장 데이터가 동일하다.
		//EX
//		String a = "1";
//		String b = "1";
//		if (a == b); //x 주소를 비교
//		if (a.equals(b)); //o 값을 비교
		
		
	}

}
