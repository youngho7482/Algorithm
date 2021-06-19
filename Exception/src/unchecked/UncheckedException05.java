package unchecked;

public class UncheckedException05 {
	public static void main(String[] args) {
		int arr[]  = new int [0];
		try {
			System.out.println("합계::"+getTotal(arr));
			System.out.println("평균::" +getAverage(arr));
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();  
			
		}  // 3단계 
		
	}
		static int getTotal(int arr[])  {		//총점    2단계 
			if (arr.length ==0)
				try {
					throw new Exception("비어있는 배열입니다1 ");
				} catch (Exception e) {
					System.out.println(e.getMessage());
					e.printStackTrace();
				}  //예외를 강제적으로 발생   1단계 
			int total =0;
			
			for (int num:arr)
				total += num;
			return 0;
		}
		static double getAverage(int arr[]) {
			if(arr.length ==0)
				try {
					throw new Exception("비어있는 배열입니다2");
				} catch (Exception e) {
					System.out.println(e.getMessage());
					
				}
			return getTotal(arr)/arr.length;
		}
}
