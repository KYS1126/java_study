package A22_11_28_reflection;

public class GetResourceEx {

	public static void main(String[] args) {
		Class clazz = Car.class;
		
		//리소스의 대한 정보를 가져옴, path - 경로를 알려준다.
		String photo1Path = clazz.getResource("3-2.png").getPath();
		String photo2Path = clazz.getResource("imgs/3-2.png").getPath();
		
		
		System.out.println("photo1Path");
		System.out.println("photo2Path");
		
		
		
	}

}
