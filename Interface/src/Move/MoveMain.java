package Move;

public class MoveMain {
		public static void main(String[] args) {
			//�ڽ� Ŭ������ ��ü ������ ���� ��� 
			Rectangle r = new Rectangle(100, 200, 10, 20);  //3�� 
			printRectangle(r);  //1�� r�� �ּҰ� ����־� 
			
			r.moveTo(25, 35);
			printRectangle(r);
			
			r.moveBy(-5, -5);
			printRectangle(r);
			
			r.resize(30, 30);
			printRectangle(r);
		}
		static void printRectangle(Rectangle rc) {   //2��  r��  rc�� �� 
	 		System.out.println(rc.x+":"+rc.y+"::"+rc.width+":"+rc.height);      //4�� 
			
			
		}
}
