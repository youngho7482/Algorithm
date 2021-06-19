package checked;

//checked Exception : �����ϵ� �ȵǰ� ���൵ �ȵȴ� -- �ݵ�� ���� ó�� �ʿ� 

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CheckedException {
	public static void main(String[] args) {
		FileReader f=null;    //�޼��� �ȿ� ����Ϸ��� ������ ���� �ʱ�ȭ�� �Ǿ�߸� �Ѵ�
 		try {
			f = new FileReader("some.txt");
		} catch (FileNotFoundException e) {
			System.out.println("������ �����ϴ�");   //������ ���� �� 
		}catch (Exception e) {
			String str = e.getMessage();
			System.out.println(str);
			System.out.println("������ ������ ������ �����ϴ�");  //������ ������ 
		}
 		System.out.println("Done");
		
 		try {
			f.close();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
}
