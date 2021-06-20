package Map;

import java.util.HashMap;
import java.util.Map;

public class Average_Calculator {
	public static void main(String[] args) {
		//key 형태를 String , value 형태를 Double로 갖는 Map 선언 
		Map<String,Double> scores = new HashMap<String, Double>();
		
		//각각의 key와 value에 해당하는 값을 넣어 
		scores.put("Math", 95.5);
		scores.put("Physics", 81.5);
		scores.put("english", 98.5);
		scores.put("programming", 85.0);
		
		//key값으로 Map의 value를 갖고와서 각각의 변수에 할당 
		double math = scores.get("Math");
		double physics = scores.get("Physics");
		double english = scores.get("english");
		double programming = scores.get("programming");
		
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
