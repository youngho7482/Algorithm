package unchecked;

public class UncheckedException03 {
	public static void main(String[] args) {
		int arr[] = {5,4,3,2,1,0};
		
			 for (int cnt= 0; cnt<10;cnt++) {
					try {
				 	int share = 100/arr[cnt];  //컴파일은 통과하나 실행할 떄 문제발생 
					 System.out.println(share);
					}
					catch(ArithmeticException e) {  //연산잘못되면 
						System.out.println("fuck");  //6번까지 
					}catch(ArrayIndexOutOfBoundsException e) {  //배열의 범위를 벗어나
						System.out.println("잘못된 index");  //7~10
					}catch(Exception e) {  //일반적인 예외   범위가 제일 큰 것 
						System.out.println("일반적인 예외 입니다"); //7~10
					}
			 }
			 System.out.println("Done");
	}
}
