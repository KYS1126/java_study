package interface_test.study;

public class ExtendsEx {

	public static void main(String[] args) {
		interfaceCImpl impl = new interfaceCImpl();
		
		interfaceA ia = impl; //자동 형변환
		ia.methodA();
		
		interfaceB ib = impl; //자동 형변환
		ib.methodB();
		
		interfaceC ic = impl; //자동 형변환
		ic.methodC();
		ic.methodA(); //c 인터페이스에 a,b를 상속 받았기 때문에 쓸수있어
		
	}

}
