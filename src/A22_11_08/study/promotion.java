package A22_11_08.study;

public class promotion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		byte byteValue = 10;
		int intValue = byteValue; //작은게 큰곳으로 들어가면 자동으로 형변환시켜줌
		System.out.println(intValue);
		
		char charValue = '가';
		intValue = charValue;
		System.out.println(intValue);
		
		intValue = 50;
		long longValue = intValue;
		System.out.println(longValue);
		
		longValue = 100;
		float floatValue = longValue;
		System.out.println(longValue);

		floatValue = 100.5f;
		double doubleValue = floatValue;
		System.out.println(doubleValue);
		
		//char타입의 허용범위는 음수 포함하지 않음, byte는 음수가 있기 떄문에 오류
//		byte test = 65;
//		char charValue = test;
		
		//마찬가지로 음수때문
//		short a = 1;
//		char b = a;
		
		//강제 형변환, 큰쪽에서 작은곳으로 가면 데이터가 손실됨.
		int intValue1 = 103029770;
		byte byteValue1 = (byte)intValue1;
		System.out.println(byteValue1);
		
		
		long var1 = 300;
		int var4 = (int)var1;
		System.out.println(var4);
		
		int var5 = 65;
		char var6 = (char)var5; //65유니코드를 찍음
		System.out.println(var6);
		
		
		double var7 = 3.14;
		int var8 = (int) var7; //int는 정수형이라 소수점이 손실됨
		System.out.println(var8);
		
		//계산식에서는 int로 바뀌기 때문.
		byte x = 10;
		byte y = 20;
		byte result = (byte) (x + y);
		
		byte v3 = 10;
		int v4 = 100;
		long v5 = 1000L;
		long reuslt3 = v3 + v4 + v5;
		System.out.println(reuslt3);
		System.out.println((char)reuslt3);
		
		char v6 = 'A';
		char v7 = 1;
		int result4 = v6 + v7;
		System.out.println(result4);
		
		//int형은 소수점이 없기 때문에 손실됨.
		//정수 연산의 결과는 항상 정수.
		int v8 = 10;
		int result5 = v8 / 4;
		System.out.println(result5);
		
		//
		int v9 = 10;
		double result6 = v9 / 4;
		System.out.println(result6);
		
		int v10 = 1;
		int v11 = 2;
		double result7 = (double)v10 / v11;
		System.out.println(result7);
		
		//문자열이 하나라도 있으면 문자열로 출력한다.
		String str = "안녕하세요 ㅎ헤ㅔ";
		int val = 1;
		String val2 = "3";
		System.out.println(str + val);
		System.out.println(val + val2);
		System.out.println(2 +val + val2);
		
		byte value = Byte.parseByte(val2); //문자형을 byte형으로
		System.out.println(value);
		int value2 = Integer.parseInt(val2); //문자형을 int형으로
		System.out.println(value2);
		double value3 = Double.parseDouble(val2); //문자형을 double형으로
		
		String str2 = String.valueOf(val); // 기본형(primitive)을 string으로
		
	
	
	
	
	
	
	
	
	}

}
