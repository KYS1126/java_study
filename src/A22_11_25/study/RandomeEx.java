package A22_11_25.study;

import java.util.Random;

public class RandomeEx {

	public static void main(String[] args) {
		//0.0 ~ 1.0 사이의 숫자만 출력해줌(소수, double타입)
		System.out.println(Math.random());
		
		int n = 4; //(n개의 정수) 내가 얻고싶은 정수의 갯수
		int start = 5; //시작숫자
		//
		int num = (int)(Math.random() * n) + start;
		System.out.println(num);
	
		int minNum = 15;
		int maxNum = 55;

		int ranNum = new Random().nextInt((maxNum - minNum) + 1) + minNum;

		Random random = new Random();
		System.out.println("n 미만의 랜덤 정수 리턴 : " + random.nextInt(100));
		int num1 = (int) (Math.random()* (200-190)) + 190;
		System.out.println(num1);
		
		
	}

}
