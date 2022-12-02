package test.ch07.package2;

public class Q3_Ex8 {

	public static void main(String[] args) {
	     int numOfApples = 123; // 사과의 개수
	     int sizeOfBucket = 10; // 바구니의 크기(바구니에 담을 수 있는 사과의 개수)
	     int test = 0;
	     if (numOfApples / sizeOfBucket != 0) {
	    	 test = 1;
	     } else {
	    	 test = 0;
	     }
	     int numOfBucket =(numOfApples / sizeOfBucket + test);
	     System.out.println("필요한 바구니의 수 :"+numOfBucket);
	      
	     

	}

}
