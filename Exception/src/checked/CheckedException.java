package checked;

//checked Exception : 컴파일도 안되고 실행도 안된다 -- 반드시 예외 처리 필요 

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CheckedException {
	public static void main(String[] args) {
		FileReader f=null;    //메서드 안에 사용하려는 변수는 값이 초기화가 되어야만 한다
 		try {
			f = new FileReader("some.txt");
		} catch (FileNotFoundException e) {
			System.out.println("파일이 없습니다");   //파일이 없을 때 
		}catch (Exception e) {
			String str = e.getMessage();
			System.out.println(str);
			System.out.println("파일은 있으나 내용이 없습니다");  //내용이 없을떄 
		}
 		System.out.println("Done");
		
 		try {
			f.close();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
}
