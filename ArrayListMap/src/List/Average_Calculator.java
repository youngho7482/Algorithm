package List;

import java.util.ArrayList;
import java.util.List;

public class Average_Calculator {
	public static void main(String[] args) {
		//Double ���¸� ������ scores��� �̸��� ���� �ִ� List�� ���� 
		List<Double> scores = new ArrayList<Double>();
		
		//scores�� ������ ���� �־� 
		scores.add(95.5);
		scores.add(81.5);
		scores.add(98.5);
		scores.add(85.0);
		
		//scores�� 0���� �����ϴ� index�� ����� ���� �ҷ��� ������ ������ �Ҵ� 
		double math = scores.get(0);
		double physics = scores.get(1);
		double english = scores.get(2);
		double programming = scores.get(3);
		
		// ��ձ��ϴ� ���� ���
		double average = (math + physics + english + programming) / 4;
		//�� ���� ������ ��� ��� 
		System.out.println("���� :" + math + "��");
		System.out.println("���� :" + physics + "��");
		System.out.println("���� :" + english + "��");
		System.out.println("���α׷��� :" + programming + "��");
		System.out.print("���:" + average + "��");

	}
}
