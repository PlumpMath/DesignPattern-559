package pattern.chainofresponsibility;

public class CarHeadHandler extends CarHandler {
	
	public void HandlerCar() {
		//�ⲿ����ʵ�Ѿ����ˣ�new����ǰ��Ķ���ֻ��Ҫhead.nextHandler(xxxx)����ָ����һ��
		/*CarHandler next;
		
		public CarHandler nextHandler(CarHandler next) {
			this.next = next;
			return next;
		}*/
		
		//����Լ��Ĺ���
		System.out.println("��װ��ͷ");
		
		//���������һ������һ���͵����̽���
		if(this.next != null) {
			this.next.HandlerCar();
		}
	}
}
