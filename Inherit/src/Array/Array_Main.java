package Array;

public class Array_Main {
	public static void main(String[] args) {
		
		//배열의 다형성 
		ArrayMethod am = new ArrayMethod(); // 객체 생성 
		ArrayMethod am2[] = new ArrayMethod[2];  //배열생성
		
		
		am2[0] = new ArrayA();  //생성된 자식 클래스를 부모 클래스 am2 배열에 넣어   ArrayA 덩어리가 am2[0]에 들어있어 
		am2[1] = new ArrayB(); 
		
		//for를 통해서 showSleepStyle() 출력 
		for(int i=0;i<am2.length;i++) {
			am2[i].showSleepStyle();
		}
	}
}
