package A22_11_28_Annotation;

import java.lang.annotation.*;

//Annotation 파일은 Annotation을 정의하는것

//@Target은 메소드에만 지정하겠다라는 뜻
//이렇게 지정하면 메소드에서만 적용가능함
//@Target({ElementType.METHOD, ElementType.FIELD, ElementType.CONSTRUCTOR, ElementType.TYPE})

@Target({ElementType.METHOD})

//@Retention: 유지정책, 어노테이션을 언세 시작해서 언제까지 유지를 할것인지 지정
@Retention(RetentionPolicy.RUNTIME)


public @interface printAnnotation {	
	
	//값을 받아야 하니까 변수를 만들어줌
	//default -> 주는 값이 아무것도 없으면 default값으로 준다는뜻
	String value() default "-";
	int number() default 15;
	
	
	//Annotation은 함수와 같음, 차이점은 타겟을 지정할수있고, 유지정책이 있다는것
	
	
	
	
	
	
}
