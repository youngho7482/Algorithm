package Move;

public interface Transformable extends Movable{	//Movable 인터페이스를 상속받는다 
	
	//Movable 메서드도 사용가능
	void resize(int width,int height);   //크기 변경하는 추상 메서드 

}
