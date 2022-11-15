package test.ch06.hyundai;

import test.ch06.hankook.SnowTire;
import test.ch06.kumho.AllseasonTire;

public class Car {
	//다른 패키지에 있는 class는 반드시 패키지 import 해줘야 한다
	SnowTire snowT = new SnowTire();
	AllseasonTire allT = new AllseasonTire();
	Test test = new Test();
	
	//import 없이 가져오기
	test.ch06.hankook.Tire tire1 = new test.ch06.hankook.Tire();
	
}
