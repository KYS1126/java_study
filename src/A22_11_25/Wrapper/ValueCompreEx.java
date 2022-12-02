package A22_11_25.Wrapper;

public class ValueCompreEx {

	public static void main(String[] args) {
		Integer obj1 = 300;
		Integer obj2 = 300;
		
		System.out.println(obj1 == obj2); //주소를 비교 false
		System.out.println(obj1.equals(obj2)); //값을비교 true
		System.out.println();
	
		//예외인 경우
		//[값을 비교하는 타입]
		//boolean , Character
		//byte, short, integer(int) : -128 ~ 127
		
		
		Integer obj3 = 10;
		Integer obj4 = 10;
		System.out.println(obj3 == obj4); //예외 경우 true
		System.out.println(obj3.equals(obj4)); //값을비교 true
	
	}

}
