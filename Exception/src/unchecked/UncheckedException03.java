package unchecked;

public class UncheckedException03 {
	public static void main(String[] args) {
		int arr[] = {5,4,3,2,1,0};
		
			 for (int cnt= 0; cnt<10;cnt++) {
					try {
				 	int share = 100/arr[cnt];  //�������� ����ϳ� ������ �� �����߻� 
					 System.out.println(share);
					}
					catch(ArithmeticException e) {  //�����߸��Ǹ� 
						System.out.println("fuck");  //6������ 
					}catch(ArrayIndexOutOfBoundsException e) {  //�迭�� ������ ���
						System.out.println("�߸��� index");  //7~10
					}catch(Exception e) {  //�Ϲ����� ����   ������ ���� ū �� 
						System.out.println("�Ϲ����� ���� �Դϴ�"); //7~10
					}
			 }
			 System.out.println("Done");
	}
}
