package Array;

public class Array_Main {
	public static void main(String[] args) {
		
		//�迭�� ������ 
		ArrayMethod am = new ArrayMethod(); // ��ü ���� 
		ArrayMethod am2[] = new ArrayMethod[2];  //�迭����
		
		
		am2[0] = new ArrayA();  //������ �ڽ� Ŭ������ �θ� Ŭ���� am2 �迭�� �־�   ArrayA ����� am2[0]�� ����־� 
		am2[1] = new ArrayB(); 
		
		//for�� ���ؼ� showSleepStyle() ��� 
		for(int i=0;i<am2.length;i++) {
			am2[i].showSleepStyle();
		}
	}
}
