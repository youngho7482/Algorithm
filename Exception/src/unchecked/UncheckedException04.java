package unchecked;

public class UncheckedException04 {
	public static void main(String[] args) throws Exception {
		int arr[]  = new int [10];
		System.out.println("�հ�::"+getTotal(arr));  // 3�ܰ� 
		System.out.println("���::" +getAverage(arr));
	}
		static int getTotal(int arr[]) throws Exception {		//����    2�ܰ� 
			if (arr.length ==0)
				throw new Exception("����ִ� �迭�Դϴ� ");  //���ܸ� ���������� �߻�   1�ܰ� 
			int total =0;
			
			for (int num:arr)
				total += num;
			return 0;
		}
		static double getAverage(int arr[]) throws Exception {
			if(arr.length ==0)
				throw new Exception("����ִ� �迭�Դϴ�");
			return getTotal(arr)/arr.length;
		}
}
