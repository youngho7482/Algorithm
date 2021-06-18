package Move;

public class MoveMain {
		public static void main(String[] args) {
			//자식 클래스를 객체 생성을 통해 출력 
			Rectangle r = new Rectangle(100, 200, 10, 20);  //3번 
			printRectangle(r);  //1번 r에 주소값 들어있어 
			
			r.moveTo(25, 35);
			printRectangle(r);
			
			r.moveBy(-5, -5);
			printRectangle(r);
			
			r.resize(30, 30);
			printRectangle(r);
		}
		static void printRectangle(Rectangle rc) {   //2번  r이  rc로 가 
	 		System.out.println(rc.x+":"+rc.y+"::"+rc.width+":"+rc.height);      //4번 
			
			
		}
}
