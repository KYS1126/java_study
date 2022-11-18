package A22_11_14.study;

import A22_11_15.study.GatSet;

public class GetSetEX {

	public static void main(String[] args) {
		GatSet getset = new GatSet();
		getset.setSpeed(10);
		System.out.println(getset.getSpeed());
		
		if (!getset.isStop()) { //달리고 있을때
			getset.setStop(true); //멈춤
		}
		
		System.out.println(getset.getSpeed());
										
	}

}
