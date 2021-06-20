package Array;

public class Average_Calculator {
	public static void main(String[] args) {
		//double 형태의 scores이라는 이름을 가진 4개 크기의 배열 선언 
		double[] scores = new double[4];
		
		//scores 배열의 각 자리마다 값을 할당 
		scores[0] = 95.5;
		scores[1] = 81.5;
		scores[2] = 98.5;
		scores[3] = 85.0;
		
		// 평균구하는 값을 계산
		double average = (scores[0] + scores[1] + scores[2] + scores[3]) / 4;
		
		//각 과목 점수및 평균 출력 
		System.out.println("수학:" + scores[0] + "점");
		System.out.println("물리:" + scores[1] + "점");
		System.out.println("영어:" + scores[2] + "점");
		System.out.println("프로그래밍:" + scores[3] + "점");

		System.out.print("평균:" + average + "점");

	}
}
