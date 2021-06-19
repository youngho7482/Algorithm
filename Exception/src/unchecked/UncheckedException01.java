package unchecked;

//Unchecked Exception : 컴파일은 통과하나 실행할때 문제가 발생 


public class UncheckedException01 {
	public static void main(String[] args) throws Exception {
		int num1=10;
		int num2= 0;   //지역변수는 사용하려면 값을 줘야함
		
		try {
			int result = num1/num2;
			System.out.println(result);
		} catch (Exception e) {
			System.out.println("숫자를 0으로 나눌 수 없습니다:ArithemeticException");
		}
		System.out.println("Done");
			
		//예외를 강제적으로 발생
		throw new Exception("Checked Exception");
	}
}
