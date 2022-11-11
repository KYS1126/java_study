package A22_11_09.study;

public class If_EX {

	public static void main(String[] args) {
		int score = 75;
		
		// 한줄이면 중괄호 생략가능~
		if (score >= 90)
			System.out.println("90점 이상입니다.");
		else if (score >= 80)
			System.out.println("80점 이상입니다.");
		else if (score >= 70)
			System.out.println("70점 이상입니다.");
		else {
			System.out.println("70점 이상이아닙니다.");
		}
		
		//0.0~1.0 //디폴트 리턴값은 double이다.
		int num = (int)  (Math.random()*6) + 1;
		if (num==1)
			System.out.println("1");
		else if (num==2)
			System.out.println("2");
		else if (num==3)
			System.out.println("3");
		else if (num==4)
			System.out.println("4");
		else if (num==5) 
			System.out.println("5");
		
		//사용 가능 타입 byte, char, short, int, long
		//string
		
		char grade = 'B';
		
		switch(grade) {
			case 'A':System.out.println("A");
			break;
			case 'B':System.out.println("B");
			break;
			case 'C':System.out.println("C");
			break;
			case 'D':System.out.println("D");
			break;
			case 'E':System.out.println("E");
			break;
			default:System.out.println("F");

		}
	}

}
