package pattern.chainofresponsibility;

public class CarTailHandler extends CarHandler{
	
	public void HandlerCar() {
		
		//����Լ��Ĺ���
		System.out.println("��װ��β");
		
		//���������һ������һ���������
		if(this.next != null) {
			this.next.HandlerCar();
		}
	}
}