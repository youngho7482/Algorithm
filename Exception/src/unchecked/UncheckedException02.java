package unchecked;

public class UncheckedException02 {
	public static void main(String[] args) {
		int arr[] = {5,4,3,2,1,0};
		
			 for (int cnt= 0; cnt<arr.length;cnt++) {
					try {
				 	int share = 100/arr[cnt];  //�������� ����ϳ� ������ �� �����߻� 
					 System.out.println(share);
					}
					catch(ArithmeticException e) {
						System.out.println("fuck");
					}			 
			 }
			 System.out.println("Done");
	}
}
