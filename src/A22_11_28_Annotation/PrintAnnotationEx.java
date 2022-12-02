package A22_11_28_Annotation;

import java.lang.reflect.*;

import A22_11_21.study.Service;

public class PrintAnnotationEx {

	public static void main(String[] args) {
		// 서비스에 있는 메소드를 불러온다. 총 3개
		Method[] declaredMethods = Service.class.getDeclaredMethods();

		for (Method method : declaredMethods) {
			// Annotation을 얻어온다.
			printAnnotation printAno = method.getAnnotation(printAnnotation.class);

			printLine(printAno);
			
			//메소드를 실행시키는 함수
			method.invoke(new Service()); //메소드 실행
			
			
			
		}

	}

	public static void printLine(printAnnotation printAno) {

		if (printAno != null) {
			// number 속성 값 얻기 (변수가 아니라 속성이라고 한다.)
			int number = printAno.number();
			String value = printAno.value();
		
			System.out.println(number);
			System.out.println(value);
		}
	}

}
