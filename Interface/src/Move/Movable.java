package Move;

public interface Movable {
			//interface�ȿ�  ���� ����ϸ� static final ������ ���� 
			// �߻�޼��� 
			void moveTo(int x, int y);		//������ġ�� �̵��ϴ� �߻�޼��� 
			void moveBy(int xOffset, int yOffset);  //�����ġ��ŭ �̵��ϴ� �߻�޼��� 
}
