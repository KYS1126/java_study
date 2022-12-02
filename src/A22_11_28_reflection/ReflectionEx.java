package A22_11_28_reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

//import java.lang.reflect.*; 이렇게 쓰면 reflect 안에있는 모든걸 가져온다.


public class ReflectionEx {

	public static void main(String[] args) {
		Class clazz = Car2.class; //Car 객체
		
		System.out.println("[생성자 정보]");
		Constructor[] constructors = clazz.getDeclaredConstructors();
		for (Constructor constructor : constructors) {
			System.out.print(constructor.getName() + "(");
			Class[] parameters = constructor.getParameterTypes(); //파라메터의 타입을 불러온다
			printParameters(parameters);
			System.out.println(")");
		}
		
		System.out.println("[필드 정보]");
		Field[] fields = clazz.getDeclaredFields();
		for(Field field : fields) {
			System.out.println(field.getType() + " " +  field.getName());
		}
		
		
		
		System.out.println("[메소드 정보]");
		Method[] methods = clazz.getDeclaredMethods();
		for (Method method : methods) {
			System.out.print(method.getName() + "(");
			Class[] parameters = method.getParameterTypes(); //파라메터의 타입을 불러온다
			printParameters(parameters);
			System.out.println(")");
		}
		
		
		
		
		
		
		
	}
	
	private static void printParameters (Class[] parameters) {
		for (int i=0; i<parameters.length; i++) {
			System.out.print(parameters[i].getName());
			if (i<(parameters.length-1)) {
				System.out.print(","); //매개변수 사이에 콤마를 찍는다.
			}
		
		}
	}
	
	
	
	
}
