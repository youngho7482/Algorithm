package unchecked;

//Unchecked Exception : �������� ����ϳ� �����Ҷ� ������ �߻� 


public class UncheckedException01 {
	public static void main(String[] args) throws Exception {
		int num1=10;
		int num2= 0;   //���������� ����Ϸ��� ���� �����
		
		try {
			int result = num1/num2;
			System.out.println(result);
		} catch (Exception e) {
			System.out.println("���ڸ� 0���� ���� �� �����ϴ�:ArithemeticException");
		}
		System.out.println("Done");
			
		//���ܸ� ���������� �߻�
		throw new Exception("Checked Exception");
	}
}
