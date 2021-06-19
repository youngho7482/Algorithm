package unchecked;

public class UncheckedException04 {
	public static void main(String[] args) throws Exception {
		int arr[]  = new int [10];
		System.out.println("합계::"+getTotal(arr));  // 3단계 
		System.out.println("평규::" +getAverage(arr));
	}
		static int getTotal(int arr[]) throws Exception {		//총점    2단계 
			if (arr.length ==0)
				throw new Exception("비어있는 배열입니다 ");  //예외를 강제적으로 발생   1단계 
			int total =0;
			
			for (int num:arr)
				total += num;
			return 0;
		}
		static double getAverage(int arr[]) throws Exception {
			if(arr.length ==0)
				throw new Exception("비어있는 배열입니다");
			return getTotal(arr)/arr.length;
		}
}
