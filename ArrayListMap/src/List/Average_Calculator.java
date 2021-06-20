package List;

import java.util.ArrayList;
import java.util.List;

public class Average_Calculator {
	public static void main(String[] args) {
		//Double 형태를 갖으며 scores라는 이름을 갖고 있는 List를 선언 
		List<Double> scores = new ArrayList<Double>();
		
		//scores에 각각의 값을 넣어 
		scores.add(95.5);
		scores.add(81.5);
		scores.add(98.5);
		scores.add(85.0);
		
		//scores의 0부터 시작하는 index를 사용해 값을 불러와 각각의 변수에 할당 
		double math = scores.get(0);
		double physics = scores.get(1);
		double english = scores.get(2);
		double programming = scores.get(3);
		
		// 평균구하는 값을 계산
		double average = (math + physics + english + programming) / 4;
		//각 과목 점수및 평균 출력 
		System.out.println("수학 :" + math + "점");
		System.out.println("물리 :" + physics + "점");
		System.out.println("영어 :" + english + "점");
		System.out.println("프로그래밍 :" + programming + "점");
		System.out.print("평균:" + average + "점");

	}
}
