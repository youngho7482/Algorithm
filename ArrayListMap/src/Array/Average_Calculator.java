package Array;

public class Average_Calculator {
	public static void main(String[] args) {
		//double ������ scores�̶�� �̸��� ���� 4�� ũ���� �迭 ���� 
		double[] scores = new double[4];
		
		//scores �迭�� �� �ڸ����� ���� �Ҵ� 
		scores[0] = 95.5;
		scores[1] = 81.5;
		scores[2] = 98.5;
		scores[3] = 85.0;
		
		// ��ձ��ϴ� ���� ���
		double average = (scores[0] + scores[1] + scores[2] + scores[3]) / 4;
		
		//�� ���� ������ ��� ��� 
		System.out.println("����:" + scores[0] + "��");
		System.out.println("����:" + scores[1] + "��");
		System.out.println("����:" + scores[2] + "��");
		System.out.println("���α׷���:" + scores[3] + "��");

		System.out.print("���:" + average + "��");

	}
}
