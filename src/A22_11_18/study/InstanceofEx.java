package A22_11_18.study;

public class InstanceofEx {
	public static void personInfo(Person person) {
		System.out.println("name: " + person.name);
		person.walk();
		
		if (person instanceof Student) {//person이 student 객체를 참조하냐
			Student student = (Student)person;
			student.study();
			System.out.println(student.studentNo);
		}
	}
	
	public static void main(String[] args) {
		Person p1 = new Person("홍길동");
		personInfo(p1);
		
		Person p2 = new Student("김길동", 10);
		personInfo(p2);
		
		
		
		
		
		
	}

}
