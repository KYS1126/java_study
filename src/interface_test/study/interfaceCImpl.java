package interface_test.study;

public class interfaceCImpl implements interfaceC{


	@Override
	public void methodA() {
		System.out.println("interfaceCImpl-methodA 실행");		
	}

	@Override
	public void methodB() {
		System.out.println("interfaceCImpl-methodB 실행");
	}

	@Override
	public void methodC() {
		System.out.println("interfaceCImpl-methodC 실행");
		
	}

}
