package pattern.chainofresponsibility;

public class CarBodyHandler extends CarHandler {
	
	public void HandlerCar() {
		
		//���Լ��Ĺ���
		System.out.println("��װ����");
		
		//���������һ������һ���������
		if(this.next != null) {
			this.next.HandlerCar();
		}
	}
}

