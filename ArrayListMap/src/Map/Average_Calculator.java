package Map;

import java.util.HashMap;
import java.util.Map;

public class Average_Calculator {
	public static void main(String[] args) {
		//key ���¸� String , value ���¸� Double�� ���� Map ���� 
		Map<String,Double> scores = new HashMap<String, Double>();
		
		//������ key�� value�� �ش��ϴ� ���� �־� 
		scores.put("Math", 95.5);
		scores.put("Physics", 81.5);
		scores.put("english", 98.5);
		scores.put("programming", 85.0);
		
		//key������ Map�� value�� ����ͼ� ������ ������ �Ҵ� 
		double math = scores.get("Math");
		double physics = scores.get("Physics");
		double english = scores.get("english");
		double programming = scores.get("programming");
		
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
