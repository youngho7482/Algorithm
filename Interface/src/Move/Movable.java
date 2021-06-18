package Move;

public interface Movable {
			//interface안에  변수 사용하면 static final 변수로 사용됨 
			// 추상메서드 
			void moveTo(int x, int y);		//절대위치로 이동하는 추상메서드 
			void moveBy(int xOffset, int yOffset);  //상대위치만큼 이동하는 추상메서드 
}
