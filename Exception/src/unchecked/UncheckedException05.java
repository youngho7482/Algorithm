package unchecked;

public class UncheckedException05 {
	public static void main(String[] args) {
		int arr[]  = new int [0];
		try {
			System.out.println("�հ�::"+getTotal(arr));
			System.out.println("���::" +getAverage(arr));
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();  
			
		}  // 3�ܰ� 
		
	}
		static int getTotal(int arr[])  {		//����    2�ܰ� 
			if (arr.length ==0)
				try {
					throw new Exception("����ִ� �迭�Դϴ�1 ");
				} catch (Exception e) {
					System.out.println(e.getMessage());
					e.printStackTrace();
				}  //���ܸ� ���������� �߻�   1�ܰ� 
			int total =0;
			
			for (int num:arr)
				total += num;
			return 0;
		}
		static double getAverage(int arr[]) {
			if(arr.length ==0)
				try {
					throw new Exception("����ִ� �迭�Դϴ�2");
				} catch (Exception e) {
					System.out.println(e.getMessage());
					
				}
			return getTotal(arr)/arr.length;
		}
}
